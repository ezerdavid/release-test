package david.ezer.releasebot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;


public interface ReleaseBotClient {

    @PostExchange("/releases")
    ResponseEntity<HttpStatus> registerRepository(@RequestBody RegisterRepositoryBody body);

}
