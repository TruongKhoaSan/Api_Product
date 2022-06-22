package com.khanhht13.product_crud.controller;


import com.khanhht13.product_crud.models.entity.ProductEntity;
import com.khanhht13.product_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity get(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "pageSize") int pageSize
            ) {
        Page<ProductEntity> productEntities = productRepository.findAll(PageRequest.of(page, pageSize));
        return ResponseEntity.ok(productEntities);
    }

//    @RequestMapping("/")
//    public String product(Model model){
//        List<ProductEntity> productEntityList = productRepository.findAll();
//        model.addAttribute("productList", productEntityList);
//        return "product";
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ResponseEntity find(
            @RequestParam(name = "name") String name
    )

    {
        System.out.println(name);
        return ResponseEntity.ok(productRepository.findByNameAndPrice(name));
    }

    @PostMapping("")
    public ResponseEntity create(
            @RequestBody ProductEntity productEntity
    ) {
        return ResponseEntity.ok(productRepository.save(productEntity));
    }

    @PutMapping("")
    public ResponseEntity update(
            @RequestBody ProductEntity productEntity
    ) {
        return ResponseEntity.ok(productRepository.save(productEntity));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(
            @PathVariable Long id
    ) {
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        return ResponseEntity.ok("Thanh cong");
    }



}
