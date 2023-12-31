package com.czy.Utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class factory {
    private static final JedisPool jedisPool;
    static {
        //配置连接池
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(8);
        jedisPoolConfig.setMinIdle(0);
        jedisPoolConfig.setMaxWaitMillis(1000);

        //创建连接池对象
        jedisPool = new JedisPool(jedisPoolConfig,"192.168.137.3",
                6378,1000,"123456");
    }
    public static Jedis getJedisPo(){
        return jedisPool.getResource();
    }
}
