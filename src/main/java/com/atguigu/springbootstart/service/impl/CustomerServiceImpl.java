package com.atguigu.springbootstart.service.impl;

import com.atguigu.springbootstart.bean.Customer;
import com.atguigu.springbootstart.mapper.CustomerMapper;
import com.atguigu.springbootstart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;


    @Override
    public List<Customer> getCustomerList(String table) {
        return customerMapper.getCustomerList(table);
    }

    @Override
    public Customer getCustomerById(String table, String id) {
        return customerMapper.getCustomerById(table,id);
    }

    @Override
    public void saveCustomer(String table, Customer customer) {
        customerMapper.insertCustomer(table,customer);
    }

    @Override
    public void updateCustomer(String table, String field, String field_value, String id) {
        customerMapper.updateCustomer(table,field,field_value,id);
    }

    @Override
    public void deleteCustomerById(String table, String id) {
        customerMapper.deleteCustomerById(table,id);
    }
}
