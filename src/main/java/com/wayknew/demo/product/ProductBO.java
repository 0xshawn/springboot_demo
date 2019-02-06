package com.wayknew.demo.product;

import com.wayknew.demo.product.ques.ProductQuesDTO;
import com.wayknew.demo.product.respons.ProductResponseDTO;
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




    Product getById(Long productId) {
        return productDAO.findProductByProductId(productId);
    }

    List<Product> getProductList() {
        return productDAO.findAll();
    }




    Product updateProduct(Long productId, ProductQuesDTO body) {
        Product product = productDAO.findProductByProductId(productId);

        if (body.getDescription() != null) {
            product.setDescription(body.getDescription());
        }
        if (body.getName() != null) {
            product.setName(body.getName());
        }
        if (body.getPrice() != null) {
            product.setPrice(body.getPrice());
        }

        product = productDAO.save(product);
        return product;
    }

    void deleteProduct(Long productId) {
        Product product = productDAO.findProductByProductId(productId);
        if (product != null) {
            productDAO.delete(product);
        }
    }
}
