package com.fly.test;

import cn.hutool.http.HttpUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(value = SpringRunner.class)
// 带有@SpringBootApplication 的主类
@SpringBootTest(classes = {SpringTestApplication.class})
// 将需要模拟的工具类加入其中
@PrepareForTest(value = {HttpUtil.class})
// 若报错信息中，出现没有实例化对象，将报名写到下面中
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "cn.hutool.*"})
public class ShipControllerTest {

    private MockMvc mvc;

    @Autowired
    private ShipController shipController;


    @Before
    public void before() throws IOException {
        // 创建 MockMvc
        mvc = MockMvcBuilders.standaloneSetup(shipController).build();
    }

    @Test
    public void getName() throws Exception {
        PowerMockito.mockStatic(HttpUtil.class);
        Mockito.when(HttpUtil.get(ArgumentMatchers.anyString())).thenReturn("{containerId:22,shipId:10003,tier:22,bayno:3,row:22,company:22}");
        mvc.perform(MockMvcRequestBuilders.get("/ships").cookie())
                .andDo(data -> System.out.println(data.getResponse().getContentAsString()))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}