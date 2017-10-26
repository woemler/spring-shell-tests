package me.woemler.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * @author woemler
 */
@ShellComponent
public class ImportCommands {

  public static enum DataType { SAMPLE, GENE, DATA }

//  @ShellMethod(key = "import", value = "Imports the a file of a specified type.")
//  public String fileImport(
//      @ShellOption({"-f", "--file"}) File file,
//      @ShellOption({"-t", "--type"}) DataType dataType,
//      @ShellOption(value = {"-o", "--overwrite"}, defaultValue = "false") Boolean overwrite
//  ){
//    System.out.println(String.format("Importing file=%s  dataType=%s  overwrite=%s", file, dataType, overwrite));
//    return file.getAbsolutePath();
//  }

  @ShellMethod(key = "import", value = "Imports the a file of a specified type.")
  public String jCommanderFileImport(@ShellOption(optOut = true) JCommanderCommands.ImportCommands commands){
    System.out.println(String.format("Importing with commands: %s", commands.toString()));
    return commands.getFile().getAbsolutePath();
  }

}
