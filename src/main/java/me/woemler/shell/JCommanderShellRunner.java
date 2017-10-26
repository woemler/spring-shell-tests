package me.woemler.shell;

import com.beust.jcommander.JCommander;
import me.woemler.shell.JCommanderCommands.DefaultCommands;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author woemler
 */
public class JCommanderShellRunner implements ApplicationRunner {
  
  @Override
  public void run(ApplicationArguments args) throws Exception {
    
    JCommanderCommands.ImportCommands importCommands = new JCommanderCommands.ImportCommands();
    JCommanderCommands.DefaultCommands defaultCommands = new DefaultCommands();
    
    JCommander jCommander = JCommander.newBuilder()
        .addObject(defaultCommands)
        .addCommand("import", importCommands)
        .acceptUnknownOptions(true)
        .build();
    jCommander.parse(args.getSourceArgs());
    
    if (defaultCommands.isHelp()){
      jCommander.usage();
    } else if ("import".equals(jCommander.getParsedCommand())){
      System.out.println(String.format("Importing with commands: %s", importCommands.toString()));  
    } else {
      jCommander.usage();
    }
    
  }
}
