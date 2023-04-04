package com.lin.springbootmall.dao;

import com.lin.springbootmall.dto.ProductRequest;
import com.lin.springbootmall.model.Product;

public interface ProductDao {
     Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
