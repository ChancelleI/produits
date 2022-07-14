package com.example.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produit.model.Produit;
import com.example.produit.repository.Produitrepo;

@Service
public class ProduitService_impl implements ProduitService {
	
	@Autowired
	private Produitrepo produitRepo;

	@Override
	public Produit saveproduit(Produit produit) {
		return this.produitRepo.save(produit);
	}

	@Override
	public boolean deleteProduitById(Long id) {
		this.produitRepo.deleteById(id);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Produit> getAllProduit() {
		
		return produitRepo.findAll();
	}

	
	//public boolean deleteProduit(Long id) {
		// TODO Auto-generated method stub
		//return false;
	//}

	@Override
	public Produit getProduitById(long id) {
		java.util.Optional<Produit> optional = produitRepo.findById(id);
        Produit produit1;
		if (optional.isPresent()) {
            produit1 = optional.get();
        } else {
            throw new RuntimeException(" Produit not found for id :: " + id);
        }
		// TODO Auto-generated method stub
		return produit1;
	}

}
