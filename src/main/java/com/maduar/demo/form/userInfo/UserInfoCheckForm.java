package com.maduar.demo.form.userInfo;

import com.maduar.demo.form.system.StatusForm;

public class UserInfoCheckForm extends StatusForm {

  private String custId;
  private String usrname;
  private String usrLevelId;
  private String usrFungroupId;
  private String usrEvtgroupId;
  private String usrPic;

  private Integer prodClDrop;
  private Integer prodClNew;
  private Integer prodClDiscrete;

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getUsrname() {
    return usrname;
  }

  public void setUsrname(String usrname) {
    this.usrname = usrname;
  }

  public String getUsrLevelId() {
    return usrLevelId;
  }

  public void setUsrLevelId(String usrLevelId) {
    this.usrLevelId = usrLevelId;
  }

  public String getUsrFungroupId() {
    return usrFungroupId;
  }

  public void setUsrFungroupId(String usrFungroupId) {
    this.usrFungroupId = usrFungroupId;
  }

  public String getUsrEvtgroupId() {
    return usrEvtgroupId;
  }

  public void setUsrEvtgroupId(String usrEvtgroupId) {
    this.usrEvtgroupId = usrEvtgroupId;
  }

  public String getUsrPic() {
    return usrPic;
  }

  public void setUsrPic(String usrPic) {
    this.usrPic = usrPic;
  }

  public Integer getProdClDrop() {
    return prodClDrop;
  }

  public void setProdClDrop(Integer prodClDrop) {
    this.prodClDrop = prodClDrop;
  }

  public Integer getProdClNew() {
    return prodClNew;
  }

  public void setProdClNew(Integer prodClNew) {
    this.prodClNew = prodClNew;
  }

  public Integer getProdClDiscrete() {
    return prodClDiscrete;
  }

  public void setProdClDiscrete(Integer prodClDiscrete) {
    this.prodClDiscrete = prodClDiscrete;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  private String id;
}
