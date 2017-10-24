package me.woemler.shell;

import java.io.IOException;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author woemler
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) throws IOException {
    System.out.println(String.format("%s", Arrays.asList(args)));
    SpringApplication.run(Application.class, args);
  }

}
