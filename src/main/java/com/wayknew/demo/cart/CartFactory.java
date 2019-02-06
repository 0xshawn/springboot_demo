package com.wayknew.demo.cart;

import com.wayknew.demo.cart.response.CartResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class CartFactory {
    static CartDTO toCartDTO(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setCartId(cart.getCartId());
        cartDTO.setOrderCount(cart.getOrderCount());
        cartDTO.setRealToalPrice(cart.getRealToalPrice());
        cartDTO.setSelectedItemCount(cart.getSelectedItemCount());
        cartDTO.setSelectOrderCount(cart.getSelectOrderCount());
        cartDTO.setTotalPrice(cart.getTotalPrice());
        cartDTO.setCreatedAt(cart.getCreatedAt());
        cartDTO.setUpdatedAt(cart.getUpdatedAt());
        return cartDTO;
    }

    static CartResponseDTO successResponse() {
        CartResponseDTO res = new CartResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        return res;
    }

    static CartResponseDTO successResponse(Cart cart) {
        CartDTO cartDTO = toCartDTO(cart);
        CartResponseDTO res = new CartResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setCart(cartDTO);
        return res;
    }


    static CartResponseDTO successResponse(List<Cart> carts) {
        List<CartDTO> cartDTOList = new ArrayList<>();
        carts.forEach(user -> {
            cartDTOList.add(toCartDTO(user));
        });
        CartResponseDTO res = new CartResponseDTO();
        res.setCode(0);
        res.setMessage("success");
        res.setCarts(cartDTOList);
        return res;
    }


    static CartResponseDTO errorResponse(Integer code, String message) {
        CartResponseDTO res = new CartResponseDTO();
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

}
