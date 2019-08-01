package com.w8.sunfch.springbootweb;

import com.alibaba.fastjson.JSON;
import javafx.beans.binding.When;
import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class TestApplication {

    @Test
    public void test1() {

        log.info("-------------------------------------");
    }


    @Before
    public void beforeTest() {
        log.info("before 输出------");
    }

    @After
    public void afterTest() {
        log.info("afterTest++++++++++");
    }


    /**
     * mock 基础测试
     *
     * @return void
     * @date 2019/7/28 18:41
     */
    @Test
    public void MockBaseTest() {
        List<Integer> mock = Mockito.mock(List.class);
        mock.add(1);
        Integer integer = mock.get(0);
        System.out.println(integer);
        mock.clear();
        verify(mock).add(1);
        verify(mock).clear();
        log.info("当前测试是：{}", JSON.toJSONString(mock));

    }


}
