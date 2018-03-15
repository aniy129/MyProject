package csk.entity.database;


public class Property {

  private long id;
  private String propertyName;
  private String remark;
  private long delFlag;
  private java.sql.Timestamp regTime;
  private long productSkuOptionId;
  private long productSkuOptionId1;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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


  public long getProductSkuOptionId() {
    return productSkuOptionId;
  }

  public void setProductSkuOptionId(long productSkuOptionId) {
    this.productSkuOptionId = productSkuOptionId;
  }


  public long getProductSkuOptionId1() {
    return productSkuOptionId1;
  }

  public void setProductSkuOptionId1(long productSkuOptionId1) {
    this.productSkuOptionId1 = productSkuOptionId1;
  }

}
