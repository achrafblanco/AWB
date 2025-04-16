package com.example.projetpi.Repository;

import com.example.projetpi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
