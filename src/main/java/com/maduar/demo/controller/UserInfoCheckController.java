package com.maduar.demo.controller;

import com.alibaba.fastjson.JSON;
import com.maduar.demo.db.auth.entity.UserInfo;
import com.maduar.demo.db.auth.entity.UserInfoInsertFormTest;
import com.maduar.demo.exception.InsertRowException;
import com.maduar.demo.service.UserInfoCheckService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.maduar.demo.utils.CommonUtils;


@Controller
@RequestMapping("/user")
public class UserInfoCheckController {

  private static final Logger log = LoggerFactory.getLogger(UserInfoCheckController.class);

  @Autowired
  private UserInfoCheckService userInfoCheckService;

  @GetMapping(CommonUtils.PREFIX + "/userLogin_old/{email}/{usrPwd}/")
//  @RequestMapping(CommonUtils.PREFIX + "/userLogin_old/{email}/{usrPwd}/")
//  @ResponseBody
  public String checkCustIdAndPass(@PathVariable("email") String email, 
      @PathVariable("usrPwd") String usrPwd) throws InsertRowException {
    String apiUrl = CommonUtils.PREFIX + "/usrLogin/" + email + "/" + usrPwd + "/";
    log.info("email : " + email);
    log.info("usrPwd : " + usrPwd);
    log.info("apiUrl : " + apiUrl);

    return "run";
  }

  @PostMapping("/test")
  @ResponseBody
  public String insertCustId(@RequestParam("custId") String custId
      ,@RequestParam("companyId") String companyId) throws InsertRowException {
    String apiUrl = CommonUtils.PREFIX + "/userLogin_old/" + custId + "/";
    log.info("email : " + custId);
    log.info("apiUrl : " + apiUrl);

    List<UserInfo> list = userInfoCheckService.getTest();
    System.out.println("===================");
    System.out.println(JSON.toJSONString(list));

    System.out.println("custId = " + custId + " ; companyId ; " + companyId);
    System.out.println();
    UserInfoInsertFormTest userInfoInsertFormTest = new UserInfoInsertFormTest(custId, companyId);
    int resultInt = userInfoCheckService.insertTest(userInfoInsertFormTest);
    List<UserInfo> list2 = userInfoCheckService.getTest();
    System.out.println("===================" + resultInt);
    System.out.println(JSON.toJSONString(list2));
    return "run";
  }
}
