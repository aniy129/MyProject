package csk.entity.database;


public class PropertyOption {

  private long id;
  private String options;
  private long delFlag;
  private java.sql.Timestamp regTime;
  private long propertyId;
  private long productSkuOptionId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
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


  public long getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(long propertyId) {
    this.propertyId = propertyId;
  }


  public long getProductSkuOptionId() {
    return productSkuOptionId;
  }

  public void setProductSkuOptionId(long productSkuOptionId) {
    this.productSkuOptionId = productSkuOptionId;
  }

}
