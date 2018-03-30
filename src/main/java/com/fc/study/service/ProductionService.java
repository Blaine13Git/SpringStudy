package com.fc.study.service;

import com.fc.study.entity.Production;

import java.util.List;
import java.util.Optional;

public interface ProductionService {

    Optional<Production> findById(Integer id);

    List<Production> findAll();

    List<Production> findByPriceIn(List<Integer> priceList);

    Production save(Production production);
}
