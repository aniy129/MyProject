package csk.entity.database;


public class Orders {

  private String orderId;
  private long postAddressId;
  private String postAddress;
  private double totalPrice;
  private long state;
  private java.sql.Timestamp regTime;
  private long userId;
  private long adressInfoId;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public long getPostAddressId() {
    return postAddressId;
  }

  public void setPostAddressId(long postAddressId) {
    this.postAddressId = postAddressId;
  }


  public String getPostAddress() {
    return postAddress;
  }

  public void setPostAddress(String postAddress) {
    this.postAddress = postAddress;
  }


  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
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


  public long getAdressInfoId() {
    return adressInfoId;
  }

  public void setAdressInfoId(long adressInfoId) {
    this.adressInfoId = adressInfoId;
  }

}
