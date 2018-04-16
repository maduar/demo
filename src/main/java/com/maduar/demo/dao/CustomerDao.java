package com.maduar.demo.dao;

import java.util.List;
import com.maduar.demo.entity.Customer;

public interface CustomerDao {
  
  public void saveUsers(List<Customer> list);

}
