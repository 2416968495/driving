package cn.kgc.driving.dao;

import cn.kgc.driving.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUser();
    int deleteUser(int id);
    int addUser(User user);
    List<User> login(User user);
}
