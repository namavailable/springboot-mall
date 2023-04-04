package com.lin.springbootmall.dao;

import com.lin.springbootmall.model.Product;

public interface ProductDao {
     Product getProductById(Integer productId);
}
