package lk.ijse.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    private String id;
    private String name;


    @ManyToMany
     private List<Address>addresse;  /*owners*/

    public Customer() {
    }

    public Customer(String id, String name, List<Address> addresse) {
        this.id = id;
        this.name = name;
        this.addresse = addresse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresse() {
        return addresse;
    }

    public void setAddresse(List<Address> addresse) {
        this.addresse = addresse;
    }
}
