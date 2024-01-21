package david.ezer.releasebot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Controller implements CommandLineRunner {

    private final ReleaseBotClient releaseBotClient;
    public Controller(@Autowired ReleaseBotClient releaseBotClient) {
        this.releaseBotClient = releaseBotClient;
    }

    public HttpStatusCode getTestStatus() {
        return releaseBotClient.registerRepository(new RegisterRepositoryBody("test", "repositoryName", null, "GITHUB"))
                .getStatusCode();
    }

    @Override
    public void run(String... args) throws Exception {
        var status = getTestStatus();
        System.out.println(status.value());
    }
}
