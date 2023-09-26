package com.czy;


import com.czy.pojo.User;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.client.RestTemplate;

/**
 * RedisTemplate客户端测试
 *
 * 在配置类里面配置好序列化的规则，就可以不用手动的进行序列化  但是每个对象都会存入"@class": "com.czy.pojo.User",这样一条数据到redis里
 * 这样取出来的啥时候就可以反序列化了，缺点就是平白无故占用空间
 *
 */
@SpringBootTest
public class template {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @Test
    void testString(){
        /*redisTemplate.opsForValue().set("name","test--->ysy-->redisTemplate"+ DateUtil.now());
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name------------->"+name);*/
        redisTemplate.opsForValue().set("test","测试序列化转换"+ DateUtil.newTimestampDateFormat().format(DateUtil.now()));

        Object name = redisTemplate.opsForValue().get("test");
        System.out.println("name------------->"+name);
    }
    @Test
    void  testSaveUser(){
        redisTemplate.opsForValue().set("user:100",new User("陈忠原",22));
        User user = (User)redisTemplate.opsForValue().get("user:100");
        System.out.println("user-------->"+user);
        System.out.println("");
    }
}











