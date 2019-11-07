package com.fly.test;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author 张攀钦
 * @date 2019-10-24-16:26
 * @description 测试返回数据类型为 void
 */
public class TestVoid {
    @Test
    public void test2() {
        IDepartService mock = Mockito.mock(IDepartService.class);
        Mockito.doNothing().when(mock).getName(Mockito.anyString());
        mock.getName("11");
    }

    interface IDepartService {
        void getName(String name);
    }
}
