package com.system.daoimpl;

import com.system.dao.UserDAO;
import com.system.model.Attendance;
import com.system.model.User;
import com.system.utils.JDBCUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 徐文倩
 * 2018.12.19-2017.12.20
 * 查看员工信息，修改员工信息的实现类
 */
public class UserDAOImpl implements UserDAO {
    private JDBCUtil jdbcUtil = JDBCUtil.getInitJDBCUtil();

    @Override
    public User get(String userid) throws SQLException {
        String sql = "SELECT * FROM t_user WHERE userid = ? ";
        Map<String, Object>map = jdbcUtil.executeQuerySingle(sql,new Object[]{userid});
        if(map.size()!= 0 ){
            User user = new User(map.get("userid").toString(),
                    map.get("name").toString(),(byte[])map.get("picture"),
                    map.get("sex").toString(),map.get("address").toString(),
                    map.get("place").toString(),map.get("nation").toString(),
                    (Integer)map.get("departmentid"),map.get("job").toString(),
                    map.get("tel").toString(),(Date)map.get("entrytime"),map.get("identityID").toString());
            return user;
        }else {
            return null;
        }
    }

    @Override
    public int update(User user) throws SQLException {
        String sql = "UPDATE t_user SET name = ?,picture = ?,sex = ?,address = ?,place = ?,nation = ?,departmentid = ?,job = ?,tel = ?,entrytime = ?,identityID = ? WHERE userid = ? ";
        Object[] params = {user.getName(),user.getPicture(),user.getSex(),user.getAddress(),user.getPlace(),user.getNation(),user.getDepartmentid(),user.getJob(),user.getTel(),user.getEntrytime(),user.getIdentityID(),user.getUserid()};
        int n = jdbcUtil.executeUpdate(sql,params);
        return n;
    }

    /**
     * 获取员工信息
     * @return
     * @throws SQLException
     */
    @Override
    public List<User> getAll() throws SQLException {
        String sql = "SELECT * FROM t_user ";
        List<Object> list = jdbcUtil.excuteQuery(sql,null);
        return getUserList(list);
    }

    @Override
    public int insert(Attendance attendance) throws SQLException {
        String sql = "INSERT INTO t_attendance VALUES (null,?,?,?,?) ";
        Object[] params = {attendance.getId(),attendance.getUserid(),attendance.getDate(),attendance.getAttendance()};
        int n = jdbcUtil.executeUpdate(sql,params);
        return n;
    }

    /**
     * 封装一个本类的私有方法，用来把object集合转换成user类型的集合
     * @param list
     * @return
     */
    private List<User> getUserList(List<Object> list){
        List<User> users = new ArrayList<>();
        for(Object object : list){
            Map<String,Object> map = (Map<String,Object>) object;
            User user = new User(map.get("userid").toString(),map.get("name").toString(),
                    (byte[])map.get("picture"),map.get("sex").toString(),
                    map.get("address").toString(),map.get("place").toString(),
                    map.get("nation").toString(),(Integer)map.get("departmentid"),
                    map.get("job").toString(),map.get("tel").toString(),(Date)map.get("entrytime"),
                    map.get("identityID").toString());
            users.add(user);
        }
        return users;
    }
}
