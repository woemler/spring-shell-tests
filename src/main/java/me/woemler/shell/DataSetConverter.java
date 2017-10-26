package me.woemler.shell;

import com.beust.jcommander.IStringConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * @author woemler
 */
public class DataSetConverter implements IStringConverter<DataSet> {

  @Override
  public DataSet convert(String s) {
    ObjectMapper objectMapper = new ObjectMapper();
    DataSet dataSet;
    try {
      dataSet = objectMapper.readValue(s, DataSet.class);
    } catch (IOException e){
      e.printStackTrace();
      dataSet = new DataSet();
    }
    return dataSet;
  }
}
