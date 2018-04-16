package com.maduar.demo.db.auth.entity;

public class UserInfoInsertFormTest {

  private String custId;
  private String companyId;

  public UserInfoInsertFormTest(String custId, String companyId) {
    this.custId = custId;
    this.companyId = companyId;
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }
}
