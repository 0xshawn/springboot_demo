package com.wayknew.demo.product;

import com.wayknew.demo.user.request.UserRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductBO {
    @Resource
    private ProductDAO productDAO;

    Product create(String name, String description, Long price) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        return productDAO.save(product);
    }

}
