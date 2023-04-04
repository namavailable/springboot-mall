package com.lin.springbootmall.constant;

public class EnumTest {
    public static void main(String[] args) {
        ProductCategory category=ProductCategory.FOOD;
        String s=category.name();
        String s2="CAR";
        ProductCategory category1=ProductCategory.valueOf(s2);
    }
}
