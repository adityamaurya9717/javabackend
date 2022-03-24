package com.shop.controller;

import com.shop.entity.CatalogEntity;
import com.shop.request.CatalogRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class CatalogController {
	

	@GetMapping
	public String name() {

		return "hello";
		
	}
	@PostMapping("addcatalog")
	public String addCatalog(@ModelAttribute CatalogRequest catalog, @RequestPart("file") MultipartFile file) {
		System.out.println(catalog);

		System.out.println(file);
		return "{\"status\":\"updated\"}";


	}

}
