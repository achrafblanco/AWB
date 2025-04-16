package com.example.projetpi.Repository;


import com.example.projetpi.Entity.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonRepository extends JpaRepository<Livraison,Long> {
}
