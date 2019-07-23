package com.qianshan.service;import com.alicp.jetcache.anno.CacheInvalidate;import com.alicp.jetcache.anno.CacheRefresh;import com.alicp.jetcache.anno.CacheUpdate;import com.alicp.jetcache.anno.Cached;import com.qianshan.modal.User;import java.util.concurrent.TimeUnit;public interface UserService {    @Cached(name="userCache.", key="#userId", expire = 3600)    @CacheRefresh(refresh = 6,  timeUnit = TimeUnit.SECONDS)    User getUserById(long userId);    @CacheUpdate(name="userCache.", key="#user.userId", value="#user")    void updateUser(User user);    @CacheInvalidate(name="userCache.", key="#userId")    void deleteUser(long userId);}