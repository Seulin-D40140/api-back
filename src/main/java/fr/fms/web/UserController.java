package fr.fms.web;


import fr.fms.entities.Customer;
import fr.fms.entities.User;
import fr.fms.service.ImplTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private ImplTrainingService implTrainingService;

    @GetMapping("/users")

    public List<User> allUsers()
    {
        System.out.println("Received coucou");
        return implTrainingService.getAllUsers();
    }

    @PostMapping("/customer")
    public void saveCustomer (@RequestBody Customer customer)
    {
        System.out.println("customer");
        implTrainingService.saveCustomer(customer);
    }
}
