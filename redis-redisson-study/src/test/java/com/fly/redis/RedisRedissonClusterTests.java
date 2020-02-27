package com.fly.redis;


import org.redisson.Redisson;
import org.redisson.api.*;
import org.redisson.config.Config;

class RedisRedissonClusterTests {


    public static void main(String[] args) {
        Config config = new Config();
        config.useClusterServers().addNodeAddress("redis://localhost:6382","redis://localhost:6381","redis://localhost:6380","redis://localhost:26379", "redis://localhost:26380", "redis://localhost:26381");
        RedissonClient redissonClient = Redisson.create(config);
        RBucket<String> mget_test = redissonClient.getBucket("mget_test");
//        RBucket<String> user2 = redissonClient.getBucket("user2");
//        System.out.println(user2.getAndSet("22"));
//        getList(redissonClient);
//        getMap(redissonClient);
//        getRSortedSet(redissonClient);
//        getSet(redissonClient);
//        getQueue(redissonClient);
    }

    public static void getList(RedissonClient redissonClient){
        RList<String> list1 = redissonClient.getList("list1");
        list1.add("1");
        list1.add("2");
        System.out.println(list1);

    }

    public static void getMap(RedissonClient redissonClient){
        RMap<String, String> list1 = redissonClient.getMap("map1");
        list1.put("ceshi","ceshi");
        System.out.println(list1);

    }

    public static void getRSortedSet(RedissonClient redissonClient){
        RScoredSortedSet<Object> sortset = redissonClient.getScoredSortedSet("zset22");
        sortset.add(100,"asd");
    }

    public static void getSet(RedissonClient redissonClient){
        RSet<String> sortset = redissonClient.getSet("set22");
//        sortset.add("asd");
//        sortset.add("asd");
//        sortset.add("asd");
//        sortset.add("asd2");
//        sortset.add("asd3");
        System.out.println(sortset);

    }

    public static void getQueue(RedissonClient redissonClient){
        RQueue<String> sortset = redissonClient.getQueue("queue22");
        sortset.add("asd");
        sortset.add("asd");
        sortset.add("asd");
        sortset.add("asd2");
        sortset.add("asd3");
    }
    public static void getQueue2(RedissonClient redissonClient){
        RQueue<String> sortset = redissonClient.getQueue("queue22");
    }
}
