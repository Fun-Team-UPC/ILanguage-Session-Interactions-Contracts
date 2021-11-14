package events;

import lombok.Getter;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Getter
public class SessionInteractionsAssigned {
    String sessionInteractionId;
    LocalDateTime initialDate;
    LocalDateTime finalDate;
    String sessionId;
    String externalToolId;
}
