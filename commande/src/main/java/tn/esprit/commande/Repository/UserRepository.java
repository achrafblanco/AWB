package tn.esprit.commande.Repository;

import tn.esprit.commande.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
