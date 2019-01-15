package com.wayknew.demo.cart;

import com.wayknew.demo.cart.request.CartRequestDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartBO {
    @Resource
    private CartDAO cartDAO;


    Cart create(Long productId,Long userId,Integer selectedItemCount,Integer totalPrice,Integer realToalPrice,Integer orderCount,Integer selectOrderCount){
       Cart cart = new Cart();
       cart.setProductId(productId);
       cart.setUserId(userId);
        cart.setOrderCount(orderCount);
        cart.setRealToalPrice(realToalPrice);
        cart.setSelectedItemCount(selectedItemCount);
        cart.setSelectOrderCount(selectOrderCount);
        cart.setTotalPrice(totalPrice);
        return  cartDAO.save(cart);
    }

    Cart getByCartId(Long cartId) {
        return cartDAO.findCartByCartId(cartId);
    }

    List<Cart> getCartList() {
        return cartDAO.findAll();
    }


    void deleteCart(Long cartId) {
        Cart cart = cartDAO.findCartByCartId(cartId);
        if (cart != null) {
            cartDAO.delete(cart);
        }
    }





    Cart updateCart(Long cartId, CartRequestDTO body) {
        Cart cart = cartDAO.findCartByCartId(cartId);


        if (body.getOrderCount() != null) {
            cart.setOrderCount(body.getOrderCount());
        }
        if (body.getRealToalPrice() != null) {
            cart.setRealToalPrice(body.getRealToalPrice());
        }
        if (body.getSelectedItemCount() != null) {
            cart.setSelectedItemCount(body.getSelectedItemCount());
        }
        if (body.getSelectOrderCount() != null) {
            cart.setSelectOrderCount(body.getSelectOrderCount());
        }
        if (body.getTotalPrice() != null) {
            cart.setTotalPrice(body.getTotalPrice());
        }
        cart = cartDAO.save(cart);
        return cart;
    }






}
