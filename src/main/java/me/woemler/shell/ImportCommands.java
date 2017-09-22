package me.woemler.shell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.stereotype.Component;

/**
 * @author woemler
 */
@ShellComponent
public class ImportCommands {

  private static final Logger logger = LoggerFactory.getLogger(ImportCommands.class);

  @ShellMethod("import")
  public String fileImport(
      @ShellOption String file,
      @ShellOption String dataType,
      @ShellOption(defaultValue = "false") Boolean overwrite
  ){
    logger.info(String.format("Importing file=%s  dataType=%s  overwrite=%s", file, dataType, overwrite));
    return file;
  }


}
