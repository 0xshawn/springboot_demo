package com.wayknew.demo.product;

import com.wayknew.demo.product.ques.ProductQuesDTO;
import com.wayknew.demo.product.respons.ProductResponseDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/test/v1")
public class ProductController {

    @Resource
    private ProductBO productBO;
    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public ProductResponseDTO createUser(@RequestBody ProductQuesDTO body) {
        try {
            Product product = productBO.create(body.getName(), body.getDescription(), (Long) body.getPrice());
            return ProductFactory.successResponse(product);
        } catch (Exception e) {
            return ProductFactory.errorResponse(1, e.toString());
        }
    }


}
