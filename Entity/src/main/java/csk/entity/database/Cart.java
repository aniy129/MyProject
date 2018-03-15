package csk.entity.database;


public class Cart {

  private long id;
  private long count;
  private double price;
  private java.sql.Timestamp regTime;
  private long userId;
  private long productSkuId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getProductSkuId() {
    return productSkuId;
  }

  public void setProductSkuId(long productSkuId) {
    this.productSkuId = productSkuId;
  }

}
