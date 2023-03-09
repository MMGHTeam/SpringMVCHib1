package ir.mmgh.springmvcT1.dao;

import java.util.List;

import ir.mmgh.springmvcT1.entity.Customer;

public interface CustomerDAO {
    public List <Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
