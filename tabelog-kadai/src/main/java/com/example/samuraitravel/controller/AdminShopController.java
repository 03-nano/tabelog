package com.example.samuraitravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel.entity.Shop;
import com.example.samuraitravel.repository.ShopRepository;

@Controller
@RequestMapping("/admin/shop")

public class AdminShopController {

private final ShopRepository shopRepository;         

public AdminShopController(ShopRepository shopRepository) {
    this.shopRepository = shopRepository;                
}	

@GetMapping
public String index(Model model) {
    List<Shop> shop = shopRepository.findAll();       
    
    model.addAttribute("shop", shop);             
    
    return "admin/shop/index";
}

@GetMapping("/{id}")
public String show(@PathVariable(name = "id") Integer id, Model model) {
    Shop shop = shopRepository.getReferenceById(id);
    
    model.addAttribute("shop", shop);
    
    return "admin/shop/show";
}
}