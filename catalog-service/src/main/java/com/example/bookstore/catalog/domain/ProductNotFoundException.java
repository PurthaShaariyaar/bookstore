package com.example.bookstore.catalog.domain;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(String message) {
    super(message);
  }

  public static ProductNotFoundException forCode(String code) {
    return new ProductNotFoundException("Product with the code " + code + " not found");
  }
}
