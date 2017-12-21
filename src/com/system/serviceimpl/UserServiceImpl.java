package com.system.serviceimpl;

import com.system.dao.AttendanceDAO;
import com.system.dao.UserDAO;
import com.system.factory.DAOFactory;
import com.system.model.Attendance;
import com.system.model.User;
import com.system.service.UserService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author 徐文倩
 * 2017.12.20-2017.12.21
 *修改信息的实现
 */
public class UserServiceImpl implements UserService {
    private UserDAO userDAO = DAOFactory.getUserDAOInstance();
    private AttendanceDAO attendanceDAO = DAOFactory.getAttendanceDAOInstance();

    @Override
    public Map<String, Object> userLogin(String userid, String password) {
        return null;
    }

    @Override
    public User getUser(String userid) {
        User user = null;
        try {
            user = userDAO.get(userid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<Attendance> getAttendance(String userid) throws SQLException {
        List<Attendance> list = null;
        list = attendanceDAO.getAttendance(userid);
        return list;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag = false;
        int n = 0;
        try {
            n = userDAO.update(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(n == 1){
            flag = true;
        }
        return flag;
    }
}
