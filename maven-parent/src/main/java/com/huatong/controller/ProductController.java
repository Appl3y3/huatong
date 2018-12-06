package com.huatong.controller;

import com.huatong.entity.Product;
import com.huatong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @RequestMapping("/find")
    public String find(Model model){
        List<Product> list = productService.findAll();
        model.addAttribute("productlist",list);
        return "/productlist";
    }


}
