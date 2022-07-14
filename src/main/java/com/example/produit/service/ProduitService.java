package com.example.produit.service;

import java.util.List;

import com.example.produit.model.Produit;

public interface ProduitService {

	public Produit saveproduit(Produit produit);
	//public boolean deleteProduit(Long id);
	public List<Produit> getAllProduit();
	boolean deleteProduitById(Long id);
	//Produit getproduiteById(long id);
	public Produit getProduitById(long id);
}
