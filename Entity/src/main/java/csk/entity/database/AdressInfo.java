package csk.entity.database;


public class AdressInfo {

  private long id;
  private String name;
  private String province;
  private String city;
  private String county;
  private String address;
  private String telPhone;
  private String phone;
  private String postCode;
  private long useTime;
  private long isDefaultBit;
  private java.sql.Timestamp regTime;
  private long userId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public String getTelPhone() {
    return telPhone;
  }

  public void setTelPhone(String telPhone) {
    this.telPhone = telPhone;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public long getUseTime() {
    return useTime;
  }

  public void setUseTime(long useTime) {
    this.useTime = useTime;
  }


  public long getIsDefaultBit() {
    return isDefaultBit;
  }

  public void setIsDefaultBit(long isDefaultBit) {
    this.isDefaultBit = isDefaultBit;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
