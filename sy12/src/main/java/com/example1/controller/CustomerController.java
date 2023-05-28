package com.example1.controller;

import com.example1.entity.Customer;
import com.example1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/findallcustomer")
    public void findAllCustomer(){
        List<Customer> Customers =customerService.findAllCustomer();
        System.out.println(Customers.toString());
    }

    @GetMapping("/save")
    public void saveCustomer(){
        Customer cus=new Customer();
        cus.setDepartment("软件工程");
        cus.setName("梁爽");
        cus.setJobNo("A00123");
        customerService.saveCustomer(cus);
        System.out.println("save success");
    }

    @GetMapping("/getCustomer/{id}")
    public void getCustomerById(@PathVariable Integer id){
        Customer customer=customerService.getById(id);
        System.out.println("finish");
        System.out.println(customer);
    }

    @GetMapping("/delCustomer/{id}")
    public void deleteCustomerByid(@PathVariable Integer id){
        customerService.deleteById(id);
        System.out.println("delete success");
    }

    @GetMapping("/findAll")
    public void findAll(){
        PageRequest pageRequest=PageRequest.of(0,2);
        Page<Customer>page=customerService.findAll(pageRequest);
        System.out.println("总页数"+page.getTotalPages());
        System.out.println("总的记录数"+page.getTotalElements());
        System.out.println("查询结果"+page.getContent());
        System.out.println("当前页数"+page.getNumber()+1);
        System.out.println("当前记录数"+page.getNumberOfElements());
        System.out.println("每一页记录数"+page.getSize());
    }


}
