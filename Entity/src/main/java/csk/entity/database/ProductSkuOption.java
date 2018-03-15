package csk.entity.database;


public class ProductSkuOption {

  private long id;
  private long delFlag;
  private java.sql.Timestamp regTime;
  private long productSkuId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(long delFlag) {
    this.delFlag = delFlag;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public long getProductSkuId() {
    return productSkuId;
  }

  public void setProductSkuId(long productSkuId) {
    this.productSkuId = productSkuId;
  }

}
