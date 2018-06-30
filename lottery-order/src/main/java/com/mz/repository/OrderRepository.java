package com.mz.repository;

import com.mz.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mz
 * @Description：
 * @date 2018/6/30
 * @time 9:10
 */
public interface OrderRepository extends JpaRepository<Order, String> {
}
