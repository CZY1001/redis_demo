package com.czy;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;


public class jedisTest {
    private Jedis jedis;

    @BeforeEach
    void setup(){
        jedis = new Jedis("192.168.137.3",6378);
        jedis.auth("123456");
        //选择库
        jedis.select(0);
    }

    /**
     * 测试字符串
     */
    @Test
    void testString(){
        //存入数据
        String set = jedis.set("name", "ysyyyy");
        System.out.println("set"+set);
        //去除
        String name = jedis.get("name");
        System.out.println("name"+name);

    }

    /**
     * 测试哈希
     */
    @Test
    void testHash(){

        jedis.hset("user:czyyy","name","czyy");
        jedis.hset("user:czyyy","age","21");

        Map<String, String> stringStringMap = jedis.hgetAll("user:czyyy");
        System.out.println(stringStringMap);
    }



    @AfterEach
    void tearDown(){
        if (jedis != null) {
            jedis.close();
        }

    }
}
