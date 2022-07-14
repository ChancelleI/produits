package com.example.produit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.produit.model.Produit;
import com.example.produit.service.ProduitService;

@SpringBootApplication
public class ProduitApplication implements CommandLineRunner {

	@Autowired 
	public ProduitService produitService;
	public static void main(String[] args) {
		SpringApplication.run(ProduitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		produitService.saveproduit( new Produit("telephone","encore propre","50000"));
		produitService.saveproduit( new Produit("chauffe eau","encore propre","50000"));
		produitService.saveproduit( new Produit("bic","encore propre","50000"));
		produitService.saveproduit( new Produit("cahiers","encore propre","50000"));
		produitService.saveproduit( new Produit("ordinateur","encore propre","50000"));
		
		
	}

}
