package csk.entity.database;


public class User {

  private long id;
  private String loginId;
  private String loginPwd;
  private String name;
  private java.sql.Timestamp birthday;
  private long gender;
  private String phone;
  private String email;
  private String province;
  private String city;
  private String county;
  private String address;
  private long state;
  private String code;
  private String path;
  private long failTime;
  private String redundance;
  private String lastLoginIp;
  private String secondLsIp;
  private java.sql.Timestamp lastLoginTime;
  private java.sql.Timestamp secondLsLTgTime;
  private java.sql.Timestamp regTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public String getLoginPwd() {
    return loginPwd;
  }

  public void setLoginPwd(String loginPwd) {
    this.loginPwd = loginPwd;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public long getFailTime() {
    return failTime;
  }

  public void setFailTime(long failTime) {
    this.failTime = failTime;
  }


  public String getRedundance() {
    return redundance;
  }

  public void setRedundance(String redundance) {
    this.redundance = redundance;
  }


  public String getLastLoginIp() {
    return lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }


  public String getSecondLsIp() {
    return secondLsIp;
  }

  public void setSecondLsIp(String secondLsIp) {
    this.secondLsIp = secondLsIp;
  }


  public java.sql.Timestamp getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(java.sql.Timestamp lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }


  public java.sql.Timestamp getSecondLsLTgTime() {
    return secondLsLTgTime;
  }

  public void setSecondLsLTgTime(java.sql.Timestamp secondLsLTgTime) {
    this.secondLsLTgTime = secondLsLTgTime;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }

}
