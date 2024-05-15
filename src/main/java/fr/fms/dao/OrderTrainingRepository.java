package fr.fms.dao;

import fr.fms.entities.OrderTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTrainingRepository extends JpaRepository<OrderTraining , Long> {
}
