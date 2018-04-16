package com.maduar.demo.db.auth.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

public class UserInfo {
  private String companyId;
  private String custId;
  private String email;

  public UserInfo(String companyId, String custId, String email) {
    this.companyId = companyId;
    this.custId = custId;
    this.email = email;
  }

  public UserInfo(String custId, String email) {
    this.custId = custId;
    this.email = email;
  }

  public String getCompanyId() {
    return companyId;

  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
