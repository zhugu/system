package com.system.factory;

import com.system.dao.AttendanceDAO;
import com.system.dao.UserDAO;
import com.system.daoimpl.AttendanceDAOImpl;
import com.system.daoimpl.UserDAOImpl;

/**
 * @author 徐文倩
 */
public class DAOFactory {
    public static UserDAO getUserDAOInstance(){
        return new UserDAOImpl();
    }
    public static AttendanceDAO getAttendanceDAOInstance(){
        return new AttendanceDAOImpl();
    }
}
