package com.maduar.demo.form.system;

public class StatusForm {

  private boolean success;
  private String error;

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public StatusForm() {
    super();
    this.success = true;
  }
}
