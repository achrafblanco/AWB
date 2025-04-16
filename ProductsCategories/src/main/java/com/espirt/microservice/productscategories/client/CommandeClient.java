package com.espirt.microservice.productscategories.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MICRO", url = "http://localhost:8085/commande-service/commande")
public interface CommandeClient {
    @GetMapping("/")
    List<Commande> getCommande();

    @GetMapping("/{id}")
    Commande getCommandeById(@PathVariable("id") Long id);
}

