package com.maduar.demo.service.impl;

import com.maduar.demo.auth.dao.UserInfoMapper;
import com.maduar.demo.db.auth.entity.UserInfo;
import com.maduar.demo.db.auth.entity.UserInfoInsertFormTest;
import com.maduar.demo.exception.InsertRowException;
import com.maduar.demo.form.userInfo.UserInfoCheckForm;
import com.maduar.demo.service.UserInfoCheckService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configurable
@Configuration
public class UserInfoCheckServiceImpl implements UserInfoCheckService {

  @Autowired
  UserInfoMapper userInfoMapper;

  @Override
  public UserInfoCheckForm checkCustIdandPass(String email, String pass, String ip)
      throws InsertRowException {
    return null;
  }

  @Override
  public List<UserInfo> getTest() throws InsertRowException {
    return userInfoMapper.getTest();
  }

  @Override
  public int insertTest(UserInfoInsertFormTest userInfoInsertFormTest) throws InsertRowException {
    return userInfoMapper.insertUserInfoTest(userInfoInsertFormTest);
  }
}
