package com.atguigu.springbootstart.service;

import com.atguigu.springbootstart.bean.Customer;
import com.atguigu.springbootstart.mapper.CustomerMapper;

import java.util.List;

public interface CustomerService {


    public List<Customer> getCustomerList(String table);
    public Customer getCustomerById(String table, String id);

    //If isInsert is true ->insert operation else ->update operation
    public void saveCustomer(String table, Customer customer);

    public void updateCustomer(String table, String field,String field_value,String id);


    public void deleteCustomerById(String table,String id);


}
