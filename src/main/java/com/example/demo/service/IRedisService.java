package com.example.demo.service;

import java.util.List;

/**
 * Created by zero-j on 2017/7/18.
 */
public interface IRedisService {

    public boolean set(String key, String value);

    public String get(String key);

    public boolean expire(String key,long expire);

    public <T> boolean setList(String key ,List<T> list);

    public <T> List<T> getList(String key, Class<T> clz);

    public long lpush(String key,Object obj);

    public long rpush(String key,Object obj);

    public String lpop(String key);

}
