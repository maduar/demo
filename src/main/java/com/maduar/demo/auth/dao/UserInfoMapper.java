package com.maduar.demo.auth.dao;

import com.maduar.demo.db.auth.entity.UserInfo;
import com.maduar.demo.db.auth.entity.UserInfoInsertFormTest;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.Query;

@Mapper
public interface UserInfoMapper {
  @Insert("INSERT into USER_INFO("
      + "CUST_ID, EMAIL, COUNTRY_CODE, MOBILE_PHONE "
      + ", USRNAME, USRPWD, COMPANY_ID, JOB_TITLE, ICON, FILE_URL "
      + ", SET_DTFIRST, IS_ACT, IS_DEL, ACT_DATE, EXPIRED_DATE "
      + ", USR_LEVEL_ID ,USR_FUNGROUP_ID, USR_EVTGROUP_ID "
      + ", BE_MEMBER_DATE, CREATE_DATE, CREATE_USER "
      + ", MODIFIED_DATE, MODIFIED_USER"
      + ", PROD_CL_DROP, PROD_CL_NEW, PROD_CL_DISCRETE, PROD_SCLSET "
      + ", STATUS "
      + ") VALUES("
      + " #{custId}, #{email}, #{countryCode}, #{mobilePhone} "
      + ", #{usrname}, #{usrpwd}, #{companyId}, #{jobTitle}, null, 'pic1.png' "
      + ", 'M', '0', 'N', getDate(), getDate() + ${modifiedUser} "
      + ", #{usrLevelId}, #{usrFungroupId}, #{usrEvtgroupId} "
      + ", null, getDate(), #{custId} "
      + ", null, null "
      + ", 180, 180, 50, 180 "
      + ", '0' "
      + ")")
  int insertUserInfo(UserInfo userInfoInsertForm);

  @Insert("INSERT into USER_INFO("
      + "company_id, cust_id"
      + ") VALUES("
      + " #{companyId}, #{custId} )")
  int insertUserInfoTest(UserInfoInsertFormTest userInfoInsertFormTest);

  @Select("select company_id, cust_id, email from USER_INFO")
  List<UserInfo> getTest();
}
