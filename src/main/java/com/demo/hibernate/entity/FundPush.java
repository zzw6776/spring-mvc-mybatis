package com.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name="fund_push")
public class FundPush {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length=50)
    private String id;
    /**
     * 基金id
     */
    private String fundId;
    /**
     * 对应推送的account集合,以,分割
     */
    private String accounts;

}
