package fr.fms.service;

import fr.fms.entities.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItraingService
{
    List<Training> getAllTrainings();

    Training saveTraining(Training training);

    void deleteTraining ( Long id);

    List<Category> getAllCategories();

    List<Training> getByCategoryId(Long id);

    List<User> getAllUsers();

    void saveCustomer(Customer customer);

    void saveOrde(Commande commande);

    void saveTrainingOrde(OrderTraining orderTraining);

}
