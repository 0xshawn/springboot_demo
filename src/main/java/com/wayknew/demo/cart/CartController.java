package com.wayknew.demo.cart;

import com.wayknew.demo.cart.request.CartRequestDTO;
import com.wayknew.demo.cart.response.CartResponseDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping(value = "/api/v1")
public class CartController {
    @Resource
    private CartBO cartBO;

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    public CartResponseDTO createCart(@RequestBody CartRequestDTO body) {
        try {
            Cart cart = cartBO.create(body.getProductId(),body.getUserId(),body.getTotalPrice(),body.getSelectOrderCount(),body.getSelectedItemCount(),body.getOrderCount(),body.getRealToalPrice());
            return CartFactory.successResponse(cart);
        } catch (Exception e) {
            return CartFactory.errorResponse(1, e.toString());
        }
    }





    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public CartResponseDTO getCartList() {
        try {
            List<Cart> carts = cartBO.getCartList();
            return CartFactory.successResponse(carts);
        } catch (Exception e) {
            return CartFactory.errorResponse(2, e.toString());
        }
    }

    @RequestMapping(value = "/cart/{cartId}", method = RequestMethod.GET)
    public CartResponseDTO getCartById(@PathVariable("cartId") Long cartId) {
        try {
            Cart cart = cartBO.getByCartId(cartId);
            return CartFactory.successResponse(cart);
        } catch (Exception e) {
            return CartFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/cart/{cartId}", method = RequestMethod.PATCH)
    public CartResponseDTO updateCart(@PathVariable("cartId") Long cartId,
                                      @RequestBody CartRequestDTO body) {
        try {
            Cart cart = cartBO.updateCart(cartId, body);
            return CartFactory.successResponse(cart);
        } catch (Exception e) {
            return CartFactory.errorResponse(3, e.toString());
        }
    }

    @RequestMapping(value = "/cart/{cartId}", method = RequestMethod.DELETE)
    public CartResponseDTO deleteCart(@PathVariable("cartId") Long cartId) {
        try {
            cartBO.deleteCart(cartId);
            return CartFactory.successResponse();
        } catch (Exception e) {
            return CartFactory.errorResponse(3, e.toString());
        }
    }


}
