package esprit.micro;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    List<Projet> findByArchivedFalse(); // Returns only active projects
    List<Projet> findByArchivedTrue();  // Returns only archived projects
    List<Projet> findByArchivedFalseAndApprovedTrue(); // ✅ Show only approved projects
    List<Projet> findByApprovedFalse(); // ✅ Show pending projects (for admin)

    List<Projet> findByEtat(Etat etat);

    List<Projet> findByNomContainingIgnoreCase(String nom);
}

