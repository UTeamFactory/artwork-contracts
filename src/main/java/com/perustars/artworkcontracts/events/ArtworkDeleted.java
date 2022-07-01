package com.perustars.artworkcontracts.events;

import lombok.Value;
import java.time.Instant;

@Value
public class ArtworkDeleted {
    private String artworkId;
    private Instant occurredOn;
}
