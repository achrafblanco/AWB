package com.example.projetpi.Services;

import com.example.projetpi.Entity.Commande;
import com.example.projetpi.Entity.User;
import com.example.projetpi.Repository.CommandeRepository;
import com.example.projetpi.Repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService implements ICommandeService {


    @Autowired
    private CommandeRepository commandeRepository; // Injection avec @Autowired
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Commande> retrieveAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande retrieveCommande(Long commandeId) {
        return commandeRepository.findById(commandeId).orElse(null);
    }

    @Override
    public Commande addCommande(Commande c) {
        User staticUser = userRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Static user not found"));
        c.setUser(staticUser);
        return commandeRepository.save(c);
    }

    @Override
    public Commande modifyCommande(Commande c) {
        // Fetch the existing Commande from the repository by its ID
        Commande existingCommande = commandeRepository.findById(c.getIdcommande())
                .orElseThrow(() -> new RuntimeException("Commande not found"));

        // Ensure the user is set correctly. You can either preserve the existing user
        // or allow updating it if it's part of the request.
        if (c.getUser() != null) {
            User user = userRepository.findById(c.getUser().getId())
                    .orElseThrow(() -> new RuntimeException("User not found"));
            existingCommande.setUser(user);
        }

        // Update other fields
        existingCommande.setDetails(c.getDetails());
        existingCommande.setOrderdate(c.getOrderdate());
        existingCommande.setStatus(c.getStatus());

        // Save the updated Commande
        return commandeRepository.save(existingCommande);
    }

    @Override
    public void removeCommande(Long commandeId) {
        commandeRepository.deleteById(commandeId);
    }


    @Override
    public Integer getCommandeCount() {
        return Math.toIntExact(commandeRepository.count());
    }
}
