package com.mz.controller;

import com.mz.entity.Order;
import com.mz.entity.OrderItem;
import com.mz.repository.OrderRepository;
import com.mz.utils.JsonUtils;
import com.mz.vo.ResponseVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author mz
 * @Description：
 * @date 2018/6/30
 * @time 9:11
 */
@RestController
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/save")
    public ResponseVo<Order> save(String uid, String carts) {
        //carts 是json格式

        Order order = new Order();

        order.setOid(UUID.randomUUID().toString().replace("-", "").toUpperCase());
        order.setCreateTime(new Date());
        order.setUid(uid);

        List<OrderItem> orderItems = JsonUtils.parseList(carts, OrderItem.class);
        order.setOrderItems(orderItems);

        double total = 0;
        for (OrderItem item : orderItems) {
            item.setItemid(UUID.randomUUID().toString().replace("-", "").toUpperCase());
            total += item.getCount() * 2;
        }
        order.setTotal(total);


        orderRepository.save(order);


        return ResponseVo.success(order);
    }
}
