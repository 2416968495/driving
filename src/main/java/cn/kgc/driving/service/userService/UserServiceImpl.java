package cn.kgc.driving.service.userService;

import cn.kgc.driving.dao.UserMapper;
import cn.kgc.driving.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        List<User> users = userMapper.queryUser();
        return users;
    }

    @Override
    public int deleteUser(int id) {
        int result = userMapper.deleteUser(id);
        return result;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> login(User user) {
        List<User> users = userMapper.login(user);
        return users;
    }
}
