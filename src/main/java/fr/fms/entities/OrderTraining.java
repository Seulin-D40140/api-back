package fr.fms.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class OrderTraining implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrderItem;
    @NotNull
    private Long idArticle;
    @NotNull
    private int quantity;
    @NotNull
    private double unitaryPrice;
    @ManyToOne
    private Commande commande;

    public OrderTraining(Long idArticle, int quantity, double unitaryPrice, Commande commande) {
        this.idArticle = idArticle;
        this.quantity = quantity;
        this.unitaryPrice = unitaryPrice;
        this.commande = commande;
    }
}
