package com.berkayarslan.UserEngage.service;

import com.berkayarslan.UserEngage.general.BaseEntityService;
import com.berkayarslan.UserEngage.model.Product;
import com.berkayarslan.UserEngage.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseEntityService<Product, ProductRepository> {
    protected ProductService(ProductRepository repository) {
        super(repository);
    }
}
