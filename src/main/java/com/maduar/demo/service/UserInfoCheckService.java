package com.maduar.demo.service;

import com.maduar.demo.db.auth.entity.UserInfo;
import com.maduar.demo.db.auth.entity.UserInfoInsertFormTest;
import com.maduar.demo.exception.InsertRowException;
import com.maduar.demo.form.userInfo.UserInfoCheckForm;
import java.util.List;
import org.springframework.stereotype.Service;

public interface UserInfoCheckService {
  UserInfoCheckForm checkCustIdandPass(String email, String pass, String ip) throws InsertRowException;

  int insertTest(UserInfoInsertFormTest userInfoInsertFormTest) throws InsertRowException;

  List<UserInfo> getTest() throws InsertRowException;
}

