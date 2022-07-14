package com.example.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.produit.model.Produit;

@Repository
public interface Produitrepo extends JpaRepository<Produit, Long> {

}
