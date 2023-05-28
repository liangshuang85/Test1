package com.example1.service;

import com.example1.dao.CustomerDao;
import com.example1.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer>findAllCustomer(){
        return customerDao.findAll();
    }

    public Customer saveCustomer(Customer customer){
        return customerDao.save(customer);
    }

    public Customer getById(Integer id){
        return customerDao.getById(id);
    }

    public void deleteById(Integer id){
        customerDao.deleteById(id);
    }

    public Page<Customer> findAll(Pageable pageable){
        return customerDao.findAll(pageable);
    }
}
