package csk.entity.database;


public class ProductSku {

  private long id;
  private String skuCode;
  private double beforePrice;
  private double price;
  private long stockpile;
  private long sales;
  private String imagePath;
  private long delFlag;
  private java.sql.Timestamp regTime;
  private long productsId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSkuCode() {
    return skuCode;
  }

  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }


  public double getBeforePrice() {
    return beforePrice;
  }

  public void setBeforePrice(double beforePrice) {
    this.beforePrice = beforePrice;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getStockpile() {
    return stockpile;
  }

  public void setStockpile(long stockpile) {
    this.stockpile = stockpile;
  }


  public long getSales() {
    return sales;
  }

  public void setSales(long sales) {
    this.sales = sales;
  }


  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
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


  public long getProductsId() {
    return productsId;
  }

  public void setProductsId(long productsId) {
    this.productsId = productsId;
  }

}
