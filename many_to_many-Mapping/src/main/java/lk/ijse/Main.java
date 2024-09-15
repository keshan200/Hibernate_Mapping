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

        Customer customer1 = new Customer();
        customer1.setId("c1");
        customer1.setName("keshan");

        Customer customer2 = new Customer();
        customer2.setId("c2");
        customer2.setName("randik");

        Customer customer3 = new Customer();
        customer2.setId("c3");
        customer2.setName("randikllllllll");


        Address address1 = new Address();
        address1.setAid("A1");
        address1.setNo("no.23");
        address1.setRoad("negombo");

        Address address2 = new Address();
        address2.setAid("A2");
        address2.setNo("no.24");
        address2.setRoad("kaluthara");

        Address address3 = new Address();
        address2.setAid("A3");
        address2.setNo("no.25");
        address2.setRoad("kaluthara");




        List<Address> adrs = new ArrayList<>();
        adrs.add(address1);
        adrs.add(address2);


       List<Customer> cus = new ArrayList<>();
        cus.add(customer1);
        cus.add(customer2);
        cus.add(customer3);

   customer1.setAddresse(adrs);
   customer2.setAddresse(adrs);
   customer3.setAddresse(adrs);

   address1.setCustomer(cus);
   address2.setCustomer(cus);
   address3.setCustomer(cus);

        session.save(customer1);
        session.save(customer2);
        session.save(customer3);

        session.save(address1);
        session.save(address2);
        session.save(address3);





        transaction.commit();
        session.close();

    }
}