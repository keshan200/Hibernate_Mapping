package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("keshan");




        Address address = new Address();
        address.setAid("A1");
        address.setNo("no.23");

        address.setRoad("negombo");
        address.setCustomer(customer);




        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        save
        session.save(customer);

        session.save(address);

        transaction.commit();
        session.close();
    }
}