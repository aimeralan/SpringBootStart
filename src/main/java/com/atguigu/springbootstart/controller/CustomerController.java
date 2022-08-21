package com.atguigu.springbootstart.controller;

import com.atguigu.springbootstart.bean.Customer;
import com.atguigu.springbootstart.service.CustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    String table = "customer";

    @Autowired
    CustomerService customerService;


    @RequestMapping("customerList")
    public List<Customer> getCustomerList(String table) {
        return customerService.getCustomerList(table);
    }

    @RequestMapping("customerById/{id}")
    public Customer getCustomerById(@PathVariable("id") String id){
        return customerService.getCustomerById(table, id);
    }

    @PostMapping("/insertCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(table,customer);
        return "success";
    }

    @RequestMapping("updateCustomer/{field},{field_value},{id}")
    public String updateCustomer(@Param("field") String field,@Param("field_value") String field_value,@Param("id") String id){
        customerService.updateCustomer(table,field,field_value,id);
        return "success";
    }
    @RequestMapping("deleteCustomer/{id}")
    public String deleteCustomer(@Param("id") String id){
        customerService.deleteCustomerById(table,id);
        return "success";
    }

}
