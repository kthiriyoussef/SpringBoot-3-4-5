package com.youssef.produits;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.youssef.produits.entities.Produit;
import com.youssef.produits.service.ProduitService;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner  {
 
	@Autowired
	ProduitService produitService;
	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
