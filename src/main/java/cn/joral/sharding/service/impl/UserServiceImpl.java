package cn.joral.sharding.service.impl;

import cn.joral.sharding.mapper.UserMapper;
import cn.joral.sharding.pojo.User;
import cn.joral.sharding.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangliang
 * @date 2020/11/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Boolean addUser(User user) {
        return userMapper.insert(user) == 1;
    }
}