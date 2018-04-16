package com.maduar.demo.exception;

public class InsertRowException  extends Exception {

  private static final long serialVersionUID = 1L;

  public InsertRowException(String message, Throwable cause) {
    super(message, cause);
  }

  public InsertRowException(String message) {
    super(message);
  }
}
