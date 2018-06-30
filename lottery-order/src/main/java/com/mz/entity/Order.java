package com.mz.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author mz
 * @Description：订单类
 * @date 2018/6/30
 * @time 9:05
 */
@Entity
@Data
@Table(name = "orders")
public class Order {
    /**
     * 1.订单编号
     */
    @Id
    private String oid;
    /**
     * 2.订单创建的时间
     */
    private Date createTime;
    /**
     * 3.订单的总金额
     */
    private Double total;
    /**
     * 4.订单属于哪个用户
     */
    private String uid;

    /**
     * 订单状态 : 0 未付款, 1:待开奖, 2:已中奖, 3:已兑奖, 4:未中奖
     */
    private int state;

    /**
     * 5.一个订单中可以包含多个订单项
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "oid")
    private List<OrderItem> orderItems;
}
