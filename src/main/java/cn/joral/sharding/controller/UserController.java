package cn.joral.sharding.controller;

import cn.joral.sharding.pojo.User;
import cn.joral.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangliang
 * @date 2020/11/10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add/user")
    public Boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
