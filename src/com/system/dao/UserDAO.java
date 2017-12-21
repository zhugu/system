package com.system.dao;

import com.system.model.Attendance;
import com.system.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 徐文倩
 * 2017.12.20-2017.12.21
 */
public interface UserDAO {
    /**
     * 根据工号查询员工
     * @param userid
     * @return
     * @throws SQLException
     */
    User get(String userid) throws SQLException;

    /**
     * 更新员工信息
     * @param user
     * @return
     * @throws SQLException
     */
    int update(User user) throws SQLException;
    /**
     * 获取所有员工信息
     * @return
     * @throws SQLException
     */
    List<User> getAll() throws SQLException;

    /**
     * 员工签到新增考勤信息
     * @param attendance
     * @return
     * @throws SQLException
     */
    int insert(Attendance attendance) throws SQLException;
}
