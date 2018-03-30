package com.fc.study.dao;

import com.fc.study.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 封装数据库操作方法
 */
public interface ProductionDao extends JpaRepository<Production, Integer> {

    List<Production> findByPriceIn(List<Integer> priceList);
}
