package me.woemler.shell;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author woemler
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(Application.class, args);
  }

}
