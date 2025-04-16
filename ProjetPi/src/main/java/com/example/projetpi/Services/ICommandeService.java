package com.example.projetpi.Services;

import com.example.projetpi.Entity.Commande;
import lombok.AllArgsConstructor;
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
