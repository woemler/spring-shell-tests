package me.woemler.shell;

/**
 * @author woemler
 */
public class DataSet {
  
  private String name;
  private String source;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public String toString() {
    return "DataSet{" +
        "name='" + name + '\'' +
        ", source='" + source + '\'' +
        '}';
  }
}
