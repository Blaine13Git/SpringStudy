package com.fc.study.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DynamicUpdate //动态更新数据库中的update_time
@Data //添加lombox插件，编译时自动生成setter()、getter() 和toString方法
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer price;

    public Production(){

    }

}
