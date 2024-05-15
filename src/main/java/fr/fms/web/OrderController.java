package fr.fms.web;

import fr.fms.entities.Commande;
import fr.fms.entities.Customer;
import fr.fms.entities.OrderTraining;
import fr.fms.service.ImplTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OrderController
{
    @Autowired
    private ImplTrainingService implTrainingService;

    @PostMapping("/order")
    public void saveOrder (@RequestBody Commande commande)
    {
        System.out.println(commande.getAmount());
        implTrainingService.saveCustomer(commande.getCustomer());
        implTrainingService.saveOrde(new Commande(commande.getAmount(), commande.getCustomer()));
    }

    @PostMapping("/orderTraining")
    public void saveOrderTraining (@RequestBody OrderTraining orderTraining)
    {
        implTrainingService.saveTrainingOrde(orderTraining);
    }
}
