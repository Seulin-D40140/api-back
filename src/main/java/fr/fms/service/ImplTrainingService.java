package fr.fms.service;

import fr.fms.dao.*;
import fr.fms.entities.*;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ImplTrainingService implements ItraingService
{
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    TrainingRepository trainingRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderTrainingRepository orderTrainingRepository;



    @Autowired
    private UserRepository userRepository;

    public List<Training> getAllTrainings() { return trainingRepository.findAll(); }

    public Training saveTraining (Training training)
    {
        return trainingRepository.save(training);
    }

    public Optional<Training> getTraining(Long id)
    {
        return trainingRepository.findById(id);
    }

    public void deleteTraining(Long id)
    {
        trainingRepository.deleteById(id);
    }

    public List<Category> getAllCategories() { return categoryRepository.findAll(); }

    public  List<Training> getByCategoryId(Long id) { return trainingRepository.findByCategoryId(id); }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    public void saveCustomer(Customer customer) {  customerRepository.save(customer); }

    public void saveOrde(Commande commande) {  orderRepository.save(commande); }

    public void saveTrainingOrde(OrderTraining orderTraining) {  orderTrainingRepository.save(orderTraining); }
}
