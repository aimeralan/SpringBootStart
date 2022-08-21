package com.atguigu.springbootstart.service.impl;

import com.atguigu.springbootstart.bean.Customer;
import com.atguigu.springbootstart.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public String getCustomerById(String id) {
        return "Customer Id:"+id;
    }

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("保存customer:" + customer);
    }
}
