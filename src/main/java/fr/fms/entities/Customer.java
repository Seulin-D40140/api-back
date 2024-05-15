package fr.fms.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Customer
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String firstName;
    @NotNull
    private String address;
    @NotNull
    private String email;
    @NotNull
    private String phone;

    public Customer(String name , String firstName , String address , String email , String phone) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
}
