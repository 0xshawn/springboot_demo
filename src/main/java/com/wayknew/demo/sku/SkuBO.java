package com.wayknew.demo.sku;


import com.wayknew.demo.sku.request.SkuRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkuBO {
    @Resource
    private SkuDAO skuDAO;


    Sku create(String name, String description,Integer price,String img){
       Sku sku = new Sku();
        sku.setName(name);
        sku.setPrice(price);
        sku.setDescription(description);
        sku.setImg(img);
        return  skuDAO.save(sku);
    }

    Sku getBySkuId(Long skuId) {
        return skuDAO.findBySkuId(skuId);
    }

    List<Sku> getSkuList() {
        return skuDAO.findAll();
    }


    void deleteSku(Long skuId) {
        Sku sku = skuDAO.findBySkuId(skuId);
        if (sku != null) {
            skuDAO.delete(sku);
        }
    }





    Sku updateSku(Long skuId, SkuRequestDTO body) {
        Sku sku = skuDAO.findBySkuId(skuId);


        if (body.getName() != null) {
            sku.setName(body.getName());
        }
        if (body.getDescription() != null) {
            sku.setDescription(body.getDescription());
        }
        if (body.getPrice() != null) {
            sku.setPrice(body.getPrice());
        }
        if (body.getImg() != null) {
            sku.setImg(body.getImg());
        }
        sku = skuDAO.save(sku);
        return sku;
    }






}
