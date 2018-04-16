package com.maduar.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.maduar.demo.utils.CommonUtils;


@Controller
@RequestMapping("/demo")
public class UserInfoCheckController {

  private static final Logger log = LoggerFactory.getLogger(UserInfoCheckController.class);

  @GetMapping(CommonUtils.PREFIX + "/userLogin_old/{email}/{usrPwd}/")
//  @RequestMapping(CommonUtils.PREFIX + "/userLogin_old/{email}/{usrPwd}/")
//  @ResponseBody
  public String checkCustIdAndPass(@PathVariable("email") String email, 
      @PathVariable("usrPwd") String usrPwd) {
    String apiUrl = CommonUtils.PREFIX + "/usrLogin/" + email + "/" + usrPwd + "/";
    log.info("email : " + email);
    log.info("usrPwd : " + usrPwd);
    log.info("apiUrl : " + apiUrl);
    return "run";
  }
}
