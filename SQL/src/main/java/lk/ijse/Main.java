package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("select * from customer");

        //insert,update,delete
        nativeQuery.addEntity(Customer.class);

        List<Customer> customers = nativeQuery.list();
        for (Customer customer : customers) {
            System.out.println(customer);
        }


        transaction.commit();
        session.close();
    }
}