package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Query query = session.createQuery("from Customer");



        List<Customer> customers = query.list();

        for (Customer customer : customers) {
            System.out.println(customer.getId());

        }

        //unique values
        Query query1 = session.createQuery("from Customer where id='c1' ");

      /*  query1.setParameter("c1","c1");*/

        Customer cus = (Customer) query1.uniqueResult();
        System.out.println(cus.getId());
        System.out.println(cus.getName());



        Query query2 = session.createQuery("select name from Customer where id='c1' ");

 /*       query2.setParameter("c1","c1");*/
        List<Object>b=query2.list();

        for (Object o : b) {
            System.out.println(o);
        }
        Customer cus2 = (Customer) query2.uniqueResult();;
        System.out.println(cus2.getName());


        transaction.commit();
        session.close();

    }
}