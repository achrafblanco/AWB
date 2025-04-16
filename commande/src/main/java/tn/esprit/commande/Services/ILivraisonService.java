package tn.esprit.commande.Services;


import tn.esprit.commande.Entity.Livraison;

import java.util.List;

public interface ILivraisonService {

    public List<Livraison> retrieveAlllivraisons();
    public Livraison retrievelivraison(Long livraisonId);
public Livraison addlivraison(Livraison f);
    public void removelivraison(Long livraisonId);
    public Livraison modifylivraison(Livraison livraison);
}
