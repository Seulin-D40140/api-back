package fr.fms.dao;

import fr.fms.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Commande , Long> {
}
