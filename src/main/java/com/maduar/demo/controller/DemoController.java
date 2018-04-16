package com.maduar.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.maduar.demo.entity.Customer;
import com.maduar.demo.repository.CustomerRepository;
import com.maduar.demo.service.CustomerService;
import com.maduar.demo.service.impl.CustomerServiceImpl;


@Controller
@RequestMapping("/demo")
public class DemoController {

  private static final Logger log = LoggerFactory.getLogger(DemoController.class);

  @Autowired
  CustomerRepository repository;
 
  @RequestMapping("/hello")
  @ResponseBody
  public String home() {
    return "haha";
  }

  @RequestMapping("/jpa")
  @ResponseBody
  public String test() {
    // save a couple of customers
    repository.save(new Customer("Jack", "Bauer"));
    repository.save(new Customer("Chloe", "O'Brian"));
    // repository.find
    List<Customer> list = repository.getCustomerByFirstNameAndLastName("Jack", "Bauer");

    for (Customer c : list) {
      log.error("customer: ");
      log.error(c.toString());
    }
    return "haha";
  }

  @RequestMapping("/jpa1")
  @ResponseBody
  public String list() {
    // save a couple of customers
    int resultInt = repository.setFirstNameByLastName("maduar", "Bauer");
    System.out.println("resultInt = " + resultInt);
    
    List<Customer> list = repository.listCustomer();
    for (Customer c : list) {
      log.error("customer: ");
      log.error(c.toString());
    }
    return "haha";
  }
  
//  @RequestMapping("/list_test")
//  @ResponseBody
//  public String list_test() {
//    // save a couple of customers
//    String firstName = "1084";
//    customerService = new CustomerServiceImpl();
//    
//    List<Customer> listCustomers = new ArrayList();
//    listCustomers.add(new Customer("a", "Bauer"));
//    customerService.saveUsers(listCustomers, firstName);
//    
//    List<Customer> list = repository.listCustomer();
//    for (Customer c : list) {
//      log.error("customer: ");
//      log.error(c.toString());
//    }
//    return "haha";
//  }
}
