package me.woemler.shell;

import com.beust.jcommander.Parameter;
import java.io.File;
import me.woemler.shell.ImportCommands.DataType;

/**
 * @author woemler
 */
public class JCommanderCommands {
  
  public static class DefaultCommands {
    
    @Parameter(names = { "-h", "--help" }, help = true)
    private boolean help;

    public boolean isHelp() {
      return help;
    }

    public void setHelp(boolean help) {
      this.help = help;
    }
    
  }

  public static class ImportCommands {

    @Parameter(names = { "-f", "--file" }, required = true, description = "Data file")
    private File file;

    @Parameter(names = { "-t", "--type" }, required = true, description = "Data type")
    private DataType dataType;

    @Parameter(names = { "-o", "--overwrite" }, description = "Flag to overwrite file if it exists")
    private Boolean overwrite = false;

    public File getFile() {
      return file;
    }

    public void setFile(File file) {
      this.file = file;
    }

    public DataType getDataType() {
      return dataType;
    }

    public void setDataType(DataType dataType) {
      this.dataType = dataType;
    }

    public Boolean getOverwrite() {
      return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
      this.overwrite = overwrite;
    }

    @Override
    public String toString() {
      return "JCommanderImportCommands{" +
          "file=" + file +
          ", dataType=" + dataType +
          ", overwrite=" + overwrite +
          '}';
    }
  }
  
}
