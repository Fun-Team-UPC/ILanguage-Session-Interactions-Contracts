package commands;

import lombok.Getter;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDateTime;

@Value
@Getter
public class AssignInteractionToSession {
    @TargetAggregateIdentifier
    String sessionInteractionId;
    LocalDateTime initialDate;
    LocalDateTime finalDate;
    String sessionId;
    String externalToolId;
}
