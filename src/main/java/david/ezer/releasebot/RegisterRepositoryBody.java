package david.ezer.releasebot;

import org.springframework.lang.NonNull;

public record RegisterRepositoryBody(@NonNull String owner, @NonNull String repositoryName, String currentTag, @NonNull String repositoryHost) {
}
