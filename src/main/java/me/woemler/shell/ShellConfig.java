package me.woemler.shell;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author woemler
 */
@Configuration
@Profile({"cli"})
@ComponentScan(basePackageClasses = SpringShellCommands.class)
public class ShellConfig {

}
