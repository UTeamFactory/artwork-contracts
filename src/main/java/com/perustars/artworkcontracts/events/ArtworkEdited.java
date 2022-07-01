package com.perustars.artworkcontracts.events;

import lombok.Value;
import java.time.Instant;

@Value
public class ArtworkEdited {
    private String artworkId;
    private String artistId;
    private String type;
    private String description;
    private String title;
    private Double price;
    private String image;
    private String link;
    private Instant occurredOn;
}
