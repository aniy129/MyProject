package csk.entity.database;


public class SettingOperationsLog {

  private long id;
  private String operation;
  private String name;
  private String lastValue;
  private String value;
  private String userName;
  private String ip;
  private java.sql.Timestamp regTime;
  private long administratorsId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getLastValue() {
    return lastValue;
  }

  public void setLastValue(String lastValue) {
    this.lastValue = lastValue;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }


  public long getAdministratorsId() {
    return administratorsId;
  }

  public void setAdministratorsId(long administratorsId) {
    this.administratorsId = administratorsId;
  }

}
