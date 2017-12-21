package com.system.dao;

import com.system.factory.DAOFactory;
import com.system.model.User;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;
/**
 * @author 徐文倩
 * 2017.12.20-2017.12.21
 * 测试类
 */
public class UserDAOTest {
    private UserDAO userDAO;
    @Before
    public void setUp() throws Exception {
        userDAO = DAOFactory.getUserDAOInstance();
    }

    @Test
    public void getAll() throws Exception {
        List<User> userList = userDAO.getAll();
        userList.forEach(user -> System.out.println(user));
    }

}