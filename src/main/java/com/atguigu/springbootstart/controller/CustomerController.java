package com.atguigu.springbootstart.controller;

import com.atguigu.springbootstart.bean.Customer;
import com.atguigu.springbootstart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("customer")
    public String getCustomerByName(@RequestParam("name") String na){
        System.out.println("Customer name:" + na);
        return "success";
    }


    @RequestMapping("customerById/{id}")
    public String getCustomerById(@PathVariable("id") String id){
//        System.out.println("Customer Id:" + id);
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer")
    public String saveCustomer(@RequestBody Customer customer){
//        System.out.println("customer:" + customer);
        customerService.saveCustomer(customer);
        return "save customer:"+customer.toString();
    }

}
