package tn.esprit.commande.Repository;


import tn.esprit.commande.Entity.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonRepository extends JpaRepository<Livraison,Long> {
}
