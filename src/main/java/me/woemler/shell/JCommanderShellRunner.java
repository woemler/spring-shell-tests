package me.woemler.shell;

import com.beust.jcommander.JCommander;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author woemler
 */
public class JCommanderShellRunner implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println(args.getNonOptionArgs());
    JCommanderImportCommands importCommands = new JCommanderImportCommands();
    JCommander.newBuilder()
        .addCommand("import", importCommands)
        .acceptUnknownOptions(true)
        .build()
        .parse(args.getSourceArgs());
    System.out.println(String.format("Importing file=%s  dataType=%s  overwrite=%s",
        importCommands.getFile(), importCommands.getDataType(), importCommands.getOverwrite()));
  }
}
