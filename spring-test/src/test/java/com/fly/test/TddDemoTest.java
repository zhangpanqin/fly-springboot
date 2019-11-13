package com.fly.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 张攀钦
 * @date 2019-04-24-17:54 测试模拟一些不常用的对象
 */
public class TddDemoTest {
    interface IUserService {
        String getName(HttpServletRequest request, String name);
    }

    class UserServiceImpl implements IUserService {

        @Override
        public String getName(HttpServletRequest request, String name) {
            return request.getParameter("name");
        }
    }

    private IUserService userService;

    @Before
    public void before() {
        userService = new UserServiceImpl();
    }

    @Test
    public void test1() {
        HttpServletRequest mock = Mockito.mock(HttpServletRequest.class);
        Mockito.when(mock.getParameter(Mockito.anyString())).thenReturn("1");
        String name = userService.getName(mock, "1");
        Assert.assertEquals("1", name);
    }

    @Test
    public void run2() {

    }
}