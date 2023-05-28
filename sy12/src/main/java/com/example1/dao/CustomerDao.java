package com.example1.dao;

import com.example1.entity.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

    List<Customer>findAll();

    Customer save(Customer customer);

    Customer getById(Integer id);

    void deleteById(Integer id);

    @Override
    <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable);
}
