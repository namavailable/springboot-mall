package com.lin.springbootmall.rowMapper;

import com.lin.springbootmall.constant.ProductCategory;
import com.lin.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product=new Product();
        product.setProductId(resultSet.getInt("product_id"));
        product.setProductName(resultSet.getString("product_name"));

        String category=resultSet.getString("category");
        ProductCategory category1=ProductCategory.valueOf(category);//String 轉 Enum類型
        product.setCategory(category1);
        //product.setCategory(ProductCategory.valueOf(resultSet.getString("category"))); //一行寫法

        product.setImageUrl(resultSet.getString("image_url"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreateDate(resultSet.getTimestamp("created_date"));
        product.setLastModifiedDate(resultSet.getTimestamp("last_modified_date"));
        return product;
    }
}
