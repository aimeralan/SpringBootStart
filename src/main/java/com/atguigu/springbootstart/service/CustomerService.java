package com.atguigu.springbootstart.service;

import com.atguigu.springbootstart.bean.Customer;

public interface CustomerService {
    public String getCustomerById(String id);
    public void saveCustomer(Customer customer);
}
