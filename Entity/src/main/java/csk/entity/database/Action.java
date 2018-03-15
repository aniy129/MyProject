package csk.entity.database;


public class Action {

  private long id;
  private String name;
  private String url;
  private long httpMethod;
  private long isMenu;
  private String remark;
  private long delFlag;
  private java.sql.Timestamp regTime;
  private String parentUrl;
  private long actionType;


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


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(long httpMethod) {
    this.httpMethod = httpMethod;
  }


  public long getIsMenu() {
    return isMenu;
  }

  public void setIsMenu(long isMenu) {
    this.isMenu = isMenu;
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


  public String getParentUrl() {
    return parentUrl;
  }

  public void setParentUrl(String parentUrl) {
    this.parentUrl = parentUrl;
  }


  public long getActionType() {
    return actionType;
  }

  public void setActionType(long actionType) {
    this.actionType = actionType;
  }

}
