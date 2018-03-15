package csk.entity.database;


public class Category {

  private long id;
  private long parentId;
  private String categoryName;
  private String categoryType;
  private long level;
  private String treaPath;
  private long isleaf;
  private long delFlag;
  private java.sql.Timestamp regTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public String getTreaPath() {
    return treaPath;
  }

  public void setTreaPath(String treaPath) {
    this.treaPath = treaPath;
  }


  public long getIsleaf() {
    return isleaf;
  }

  public void setIsleaf(long isleaf) {
    this.isleaf = isleaf;
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

}
