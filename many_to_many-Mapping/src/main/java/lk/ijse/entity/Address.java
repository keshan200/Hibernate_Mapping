package lk.ijse.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Address {

    @Id
    private String aid;
    private String no;
    private String road;

    @ManyToMany(mappedBy = "addresse") /*invers */
    private List<Customer> customer;


    public Address() {
    }


    public Address(String aid, String no, String road, List<Customer> customer) {
        this.aid = aid;
        this.no = no;
        this.road = road;
        this.customer = customer;
    }


    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }
}

