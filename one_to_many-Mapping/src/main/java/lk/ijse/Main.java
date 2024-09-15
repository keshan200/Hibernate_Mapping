package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        List<Address> adrs = new ArrayList<>();


        Address address = new Address();
        address.setAid("A1");
        address.setNo("no.23");
        address.setRoad("negombo");
        address.setCustomer(customer);


        Address address1=new Address();
        address1.setAid("A2");
        address1.setNo("no.24");
        address1.setRoad("kaluthara");
        address1.setCustomer(customer);



        adrs.add(address);
        adrs.add(address1);


        customer.setId("c1");
        customer.setName("keshan");
        customer.setAddresses(adrs);


        session.save(customer);

        session.save(address);
        session.save(address1);


        transaction.commit();
        session.close();
    }
}