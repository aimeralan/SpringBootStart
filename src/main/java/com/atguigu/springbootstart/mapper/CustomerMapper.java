package com.atguigu.springbootstart.mapper;

import com.atguigu.springbootstart.bean.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("select id,name,age from ${table}")
    public List<Customer> getCustomerList(@Param("table") String table);

    @Select("select id,name,age from ${table} where id = #{id}")
    public Customer getCustomerById(@Param("table") String table, @Param("id") String id);

    @Insert("insert into ${table}(name,age) values(#{customer.name},#{customer.age})")
    public void insertCustomer(@Param("table") String table, @Param("customer") Customer customer);

    @Update("update ${table} set ${field}=#{field_value} where id=#{id}")
    public void updateCustomer(@Param("table") String table,@Param("field") String field, @Param("field_value") String field_value, @Param("id") String id);

    @Delete("delete from ${table} where id=#{id}")
    public void deleteCustomerById(@Param("table") String table,@Param("id") String id);

}
