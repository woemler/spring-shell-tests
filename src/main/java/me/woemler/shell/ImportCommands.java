package me.woemler.shell;

import java.io.File;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author woemler
 */
//@ShellComponent
public class ImportCommands {

  public static enum DataType { SAMPLE, GENE, DATA }

  @ShellMethod(key = "import", value = "Imports the a file of a specified type.")
  public String fileImport(
      @ShellOption({"-f", "--file"}) File file,
      @ShellOption({"-t", "--type"}) DataType dataType,
      @ShellOption(value = {"-o", "--overwrite"}, defaultValue = "false") Boolean overwrite
  ){
    System.out.println(String.format("Importing file=%s  dataType=%s  overwrite=%s", file, dataType, overwrite));
    return file.getAbsolutePath();
  }

  @ShellMethod(key = "jc", value = "Imports the a file of a specified type.")
  public String jCommanderFileImport(@ShellOption(optOut = true) JCommanderImportCommands commands){
    System.out.println(String.format("Importing file=%s  dataType=%s  overwrite=%s", 
        commands.getFile(), commands.getDataType(), commands.getOverwrite()));
    return commands.getFile().getAbsolutePath();
  }

}
