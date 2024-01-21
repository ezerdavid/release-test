package david.ezer.releasebot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ReleaseTestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ReleaseTestApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
