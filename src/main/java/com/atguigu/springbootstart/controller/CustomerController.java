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


    //测试ok
    @RequestMapping("/customerList")
    public String getCustomerList() {
        return customerService.getCustomerList(table).toString();
    }

    //测试ok
    @RequestMapping("customerById/{id}")
    public Customer getCustomerById(@PathVariable("id") String id){
        return customerService.getCustomerById(table, id);
    }

    //测试ok
    @PostMapping("/insertCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(table,customer);
        return "success";
    }

    //测试ok
    @RequestMapping("updateCustomer/{field}/{field_value}/{id}")
    public String updateCustomer(@PathVariable("field") String field,@PathVariable("field_value") String field_value,@PathVariable("id") String id){
        customerService.updateCustomer(table,field,field_value,id);
        return "success";
    }

    //测试ok
    @RequestMapping("deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable("id") String id){
        customerService.deleteCustomerById(table,id);
        return "success";
    }

}
