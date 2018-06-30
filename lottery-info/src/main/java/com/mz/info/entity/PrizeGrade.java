package com.mz.info.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="prizegrade")
public class PrizeGrade {
    @Id
    private Integer pid;
    //几等奖
    private Integer type;
    //中了几注
    private Integer typenum;
    //中奖金额
    private Long typemoney;
    //属于哪一期
    private String code;

}
