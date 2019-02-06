package com.wayknew.demo.sku;


import com.wayknew.demo.sku.request.SkuRequestDTO;
import com.wayknew.demo.sku.response.SkuResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v5")
public class SkuController {
    @Resource
    private SkuBO skuBO;

    @RequestMapping(value = "/sku", method = RequestMethod.POST)
    public SkuResponseDTO createCart(@RequestBody SkuRequestDTO body) {
        try {
            Sku sku = skuBO.create(body.getName(),body.getDescription(),body.getPrice(),body.getImg());
            return SkuFactory.successResponse(sku);
        } catch (Exception e) {
            return SkuFactory.errorResponse(1, e.toString());
        }
    }





    @RequestMapping(value = "/sku", method = RequestMethod.GET)
    public SkuResponseDTO getCartList() {
        try {
            List<Sku> skus = skuBO.getSkuList();
            return SkuFactory.successResponse(skus);
        } catch (Exception e) {
            return SkuFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/sku/{skuId}", method = RequestMethod.GET)
    public SkuResponseDTO getSkuById(@PathVariable("skuId") Long skuId) {
        try {
            Sku sku = skuBO.getBySkuId(skuId);
            return SkuFactory.successResponse(sku);
        } catch (Exception e) {
            return SkuFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/sku/{skuId}", method = RequestMethod.PATCH)
    public SkuResponseDTO updateSku(@PathVariable("skuId") Long skuId,
                                     @RequestBody SkuRequestDTO body) {
        try {
            Sku sku = skuBO.updateSku(skuId, body);
            return SkuFactory.successResponse(sku);
        } catch (Exception e) {
            return SkuFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/sku/{skuId}", method = RequestMethod.DELETE)
    public SkuResponseDTO deleteSku(@PathVariable("skuId") Long skuId) {
        try {
            skuBO.deleteSku(skuId);
            return SkuFactory.successResponse();
        } catch (Exception e) {
            return SkuFactory.errorResponse(3, e.toString());
        }
    }


}
