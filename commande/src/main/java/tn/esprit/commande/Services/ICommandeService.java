package tn.esprit.commande.Services;

import tn.esprit.commande.Entity.Commande;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ICommandeService {
    List<Commande> retrieveAllCommandes();
    Commande retrieveCommande(Long commandeId);
    Commande addCommande(Commande c);
    Commande modifyCommande(Commande c);
    void removeCommande(Long commandeId);
    Integer getCommandeCount();

}
