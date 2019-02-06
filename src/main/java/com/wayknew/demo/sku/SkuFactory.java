package com.wayknew.demo.sku;


import com.wayknew.demo.sku.response.SkuResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class SkuFactory {
    static SkuDTO toSkuDTO(Sku sku) {
        SkuDTO skuDTO = new SkuDTO();
        skuDTO.setSkuId(sku.getSkuId());
        skuDTO.setPrice(sku.getPrice());
        skuDTO.setName(sku.getName());
        skuDTO.setImg(sku.getImg());
        skuDTO.setDescription(sku.getDescription());
        skuDTO.setCreatedAt(sku.getCreatedAt());
        skuDTO.setUpdatedAt(sku.getUpdatedAt());
        return skuDTO;
    }

    static SkuResponseDTO successResponse() {
        SkuResponseDTO res = new SkuResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static SkuResponseDTO successResponse(Sku sku) {
        SkuDTO skuDTO = toSkuDTO(sku);
        SkuResponseDTO res = new SkuResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setSku(skuDTO);
        return res;
    }


    static SkuResponseDTO successResponse(List<Sku> skus) {
        List<SkuDTO> skuDTOList = new ArrayList<>();
        skus.forEach(user -> {
            skuDTOList.add(toSkuDTO(user));
        });
        SkuResponseDTO res = new SkuResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setSkus(skuDTOList);
        return res;
    }


    static SkuResponseDTO errorResponse(Integer code, String message) {
        SkuResponseDTO res = new SkuResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

}
