package com.maduar.demo.repository;

import java.util.List;
import javax.persistence.Table;
import javax.transaction.Transactional;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.maduar.demo.entity.Customer;

//@Table( name = "customer" )
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);
  
  @Query(" SELECT r FROM Customer r")
  List<Customer> listCustomer();
  
  List<Customer> getCustomerByFirstNameAndLastName(String firstName, String lastName);
  
  @Modifying
  @Transactional
  @Query(" update Customer c set c.firstName = ?1 where c.lastName = ?2 ")
  int setFirstNameByLastName(String firstName, String lastName);
  
}
