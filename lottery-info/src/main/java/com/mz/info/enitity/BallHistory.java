package com.mz.info.enitity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ballhistory")
public class BallHistory {
    /**
     * 彩票的期数
     */
    @Id
    private String code;
    /**
     * 彩票的名称
     */

    private String name;
    /**
     * 日期
     */

    private String date;
    /**
     * 周几开的奖
     */

    private String week;
    /**
     * 红球的数量
     */

    private String red;
    /**
     * 蓝球
     */

    private String blue;
    /**
     * 销售额
     */

    private Long sales;
    /**
     * 奖池金额
     */

    private Long poolmoney;
    /**
     * 一等奖中奖信息
     */

    private String content;
    /**
     * 记录开奖的信息
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "code")
    private List<PrizeGrade> prizegrades;
}
