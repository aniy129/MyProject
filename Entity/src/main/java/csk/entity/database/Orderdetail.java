package csk.entity.database;


public class Orderdetail {

  private long id;
  private String notice;
  private long count;
  private double price;
  private java.sql.Timestamp regTime;
  private String ordersOrderId;
  private long productSkuId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public String getOrdersOrderId() {
    return ordersOrderId;
  }

  public void setOrdersOrderId(String ordersOrderId) {
    this.ordersOrderId = ordersOrderId;
  }


  public long getProductSkuId() {
    return productSkuId;
  }

  public void setProductSkuId(long productSkuId) {
    this.productSkuId = productSkuId;
  }

}
