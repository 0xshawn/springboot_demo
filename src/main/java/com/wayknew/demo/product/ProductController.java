package com.wayknew.demo.product;

import com.wayknew.demo.product.ques.ProductQuesDTO;
import com.wayknew.demo.product.respons.ProductResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    @Resource
    private ProductBO productBO;

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public ProductResponseDTO createUser(@RequestBody ProductQuesDTO body) {
        try {
            Product product = productBO.create(body.getName(), body.getDescription(), body.getPrice());
            return ProductFactory.successResponse(product);
        } catch (Exception e) {
            return ProductFactory.errorResponse(1, e.toString());
        }
    }

    @RequestMapping(value = "/pop/{productId}", method = RequestMethod.GET)
    public ProductResponseDTO getProductById(@PathVariable("productId") Long productId) {
        try {
            Product product = productBO.getById(productId);
            return ProductFactory.successResponse(product);
        } catch (Exception e) {
            return ProductFactory.errorResponse(3, e.toString());
        }
    }



    @RequestMapping(value = "/ppp", method = RequestMethod.GET)
    public ProductResponseDTO getProductList() {
        try {
            List<Product> products = productBO.getProductList();
            return ProductFactory.successResponse(products);
        } catch (Exception e) {
            return ProductFactory.errorResponse(2, e.toString());
        }
    }


    @RequestMapping(value = "/pip/{productId}", method = RequestMethod.PATCH)
    public ProductResponseDTO updateUser(@PathVariable("productId") Long productId,
                                      @RequestBody ProductQuesDTO body) {
        try {
            Product product = productBO.updateProduct(productId, body);
            return ProductFactory.successResponse(product);
        } catch (Exception e) {
            return ProductFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/qpp/{productId}", method = RequestMethod.DELETE)
    public ProductResponseDTO deleteUser(@PathVariable("productId") Long productId) {
        try {
            productBO.deleteProduct(productId);
            return ProductFactory.successResponse();
        } catch (Exception e) {
            return ProductFactory.errorResponse(3, e.toString());
        }
    }


}
