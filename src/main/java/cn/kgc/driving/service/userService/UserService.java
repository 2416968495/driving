package cn.kgc.driving.service.userService;

import cn.kgc.driving.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryUser();
    int deleteUser(int id);
    int addUser(User user);
    List<User> login(User user);
}
