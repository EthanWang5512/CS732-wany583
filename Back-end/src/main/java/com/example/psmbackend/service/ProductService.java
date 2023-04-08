package com.example.psmbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.psmbackend.entity.Product;

import java.util.List;

public interface ProductService extends IService<Product> {

    public void creatNewProduct(Integer categoryId, String title, String description,
                                Float price, String productImage, Integer isActive);

    public void editProduct(Integer id, Integer categoryId, String title, String description,
                            Float price, String productImage, Integer isActive);


    public void editProductWithoutImage(Integer id, Integer categoryId, String title, String description,
                                        Float price, Integer isActive);

    public void deleteProductById(Integer id);

    public List<Product> getProductList();

    public Product getProductById(Integer id);
}
