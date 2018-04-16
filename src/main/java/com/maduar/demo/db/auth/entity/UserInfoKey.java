package com.maduar.demo.db.auth.entity;

import org.springframework.data.annotation.Id;

public class UserInfoKey {
  @Id
  private String companyId;
  private String custId;

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
}
