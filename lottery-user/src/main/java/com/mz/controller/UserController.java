package com.mz.controller;

import com.mz.entity.User;
import com.mz.repository.UserRepository;
import com.mz.vo.ResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mz
 * @Description：
 * @date 2018/6/29
 * @time 22:55
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;


    @PostMapping("/login")
    public ResponseVo login(String email, String password) {

        User user = userRepository.findByEmailAndPassword(email, DigestUtils.md5DigestAsHex(password.getBytes()));

        if (user != null) {
            return ResponseVo.success(user);
        } else {
            return ResponseVo.error("用户不存在");
        }
    }
}
