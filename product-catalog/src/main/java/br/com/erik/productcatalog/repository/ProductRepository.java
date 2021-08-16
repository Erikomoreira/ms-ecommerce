package br.com.erik.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.erik.productcatalog.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
