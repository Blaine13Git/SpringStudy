package com.fc.study.service;

import com.fc.study.dao.ProductionDao;
import com.fc.study.entity.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 数据库操作方法的实现
 */

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    ProductionDao productionDao;

    @Override
    public Optional<Production> findById(Integer id) {
        return productionDao.findById(id);
    }

    @Override
    public List<Production> findAll() {
        return productionDao.findAll();
    }

    @Override
    public List<Production> findByPriceIn(List<Integer> priceList) {
        return productionDao.findByPriceIn(priceList);
    }

    @Override
    public Production save(Production production) {
        return productionDao.save(production);
    }
}
