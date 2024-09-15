package lk.ijse.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

    @Id
    private String aid;
    private String no;
    private String road;


    @ManyToOne()

    @JoinColumn(name = "joinColumn")
    private Customer customer; /*invers*/

    public Address() {
    }


    public Address(String aid, String no, String road, Customer customer) {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
