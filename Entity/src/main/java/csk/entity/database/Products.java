package csk.entity.database;


public class Products {

  private long id;
  private String proName;
  private String beforeShotName;
  private String afterShotName;
  private String productCode;
  private java.sql.Timestamp onShelfDate;
  private java.sql.Timestamp offShelfDate;
  private long productState;
  private String description;
  private String trademark;
  private String imagePath;
  private java.sql.Timestamp regTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }


  public String getBeforeShotName() {
    return beforeShotName;
  }

  public void setBeforeShotName(String beforeShotName) {
    this.beforeShotName = beforeShotName;
  }


  public String getAfterShotName() {
    return afterShotName;
  }

  public void setAfterShotName(String afterShotName) {
    this.afterShotName = afterShotName;
  }


  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public java.sql.Timestamp getOnShelfDate() {
    return onShelfDate;
  }

  public void setOnShelfDate(java.sql.Timestamp onShelfDate) {
    this.onShelfDate = onShelfDate;
  }


  public java.sql.Timestamp getOffShelfDate() {
    return offShelfDate;
  }

  public void setOffShelfDate(java.sql.Timestamp offShelfDate) {
    this.offShelfDate = offShelfDate;
  }


  public long getProductState() {
    return productState;
  }

  public void setProductState(long productState) {
    this.productState = productState;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getTrademark() {
    return trademark;
  }

  public void setTrademark(String trademark) {
    this.trademark = trademark;
  }


  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }

}
