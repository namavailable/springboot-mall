package com.lin.springbootmall.service.impl;

import com.lin.springbootmall.dao.ProductDao;
import com.lin.springbootmall.model.Product;
import com.lin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
