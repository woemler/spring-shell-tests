package me.woemler.shell;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author woemler
 */
@Configuration
@Profile({"jc"})
public class ShellConfig {

  @Bean
  public JCommanderShellRunner shellRunner(){
    return new JCommanderShellRunner();
  }

}
