package com.fly.es.moudle.user.controller;

import com.fly.es.common.util.RetUtil;
import com.fly.es.moudle.user.dao.ProductRepository;
import com.fly.es.moudle.user.entity.EsProductDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author 张攀钦
 * @date 2019-11-21-16:17
 * @description
 */
@RestController
public class ProduceController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/demo/{id}")
    public RetUtil getDemo(@PathVariable String id) {
        Optional<EsProductDO> byId = productRepository.findById(id);
        return RetUtil.success(byId.orElse(null));
    }
}
