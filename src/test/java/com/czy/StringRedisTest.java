package com.czy;

import com.alibaba.fastjson2.JSON;
import com.czy.pojo.User;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

/**
 * StringRedisTemplate 客户端测试   需要手动序列化，但是都是以字符串的形式存储
 */
@SpringBootTest
public class StringRedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testString(){
        /*redisTemplate.opsForValue().set("name","test--->ysy-->redisTemplate"+ DateUtil.now());
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name------------->"+name);*/
        stringRedisTemplate.opsForValue().set("test","测试stringRedis转换"+ DateUtil.newTimestampDateFormat().format(DateUtil.now()));

        Object name = stringRedisTemplate.opsForValue().get("test");
        System.out.println("name------------->"+name);
    }

    @Test
    void  testSaveUser(){
        User user1 = new User("陈忠原1", 21);
        stringRedisTemplate.opsForValue().set("user:101", JSON.toJSONString(user1));
        User user = JSON.parseObject(stringRedisTemplate.opsForValue().get("user:101"), User.class);
        System.out.println("user-------->"+user);
    }
    @Test
    void testHash(){
        stringRedisTemplate.opsForHash().put("user:400","name","陈忠原");
        stringRedisTemplate.opsForHash().put("user:400","age","22");
        Map<Object, Object> entries = stringRedisTemplate.opsForHash().entries("user:400");
        System.out.println(entries);
    }
}
