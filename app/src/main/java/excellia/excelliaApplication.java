package excellia;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class excelliaApplication {

        public static void main(String... args) {
       // SpringApplication.run(excelliaApplication.class, args);

       SpringApplication app = new SpringApplication(excelliaApplication.class);
        // Set the server port to 8081
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
  
      }
}

