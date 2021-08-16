package br.com.erik.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import br.com.erik.productcatalog.model.Product;
import br.com.erik.productcatalog.repository.ProductRepository;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }

}
