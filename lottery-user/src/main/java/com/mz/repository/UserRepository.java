package com.mz.repository;

import com.mz.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mz
 * @Description：用户仓库
 * @date 2018/6/29
 * @time 22:55
 */
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmailAndPassword(String email, String password);
}
