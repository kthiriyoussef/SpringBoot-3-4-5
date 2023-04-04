package com.youssef.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.youssef.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
