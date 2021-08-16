package br.com.erik.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.erik.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
