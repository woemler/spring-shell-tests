package me.woemler.shell;

import java.io.IOException;
import java.util.Arrays;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author woemler
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) throws IOException {
    String[] profiles = getActiveProfiles(args);
    SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
    builder.bannerMode((Mode.LOG));
    builder.web(false);
    builder.profiles(profiles);
    System.out.println(String.format("Command line arguments: %s  Profiles: %s",
        Arrays.asList(args), Arrays.asList(profiles)));
    builder.run(args);
  }

  private static String[] getActiveProfiles(String[] args){
    return args.length > 0 ? new String[]{"jc"} : new String[]{};
  }

}
