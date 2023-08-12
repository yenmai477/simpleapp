package me.yenmai.simpleapp.controller.v1;


import me.yenmai.simpleapp.controller.v1.response.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  @GetMapping
  ResponseEntity<List<ProductResponse>> getProducts() {
    return ResponseEntity.ok().body(List.of(new ProductResponse("product demo")));
  }
}
