package com.perustars.artworkcontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterArtwork {
    @TargetAggregateIdentifier
    private String artworkId;
    private String artistId;
    private String type;
    private String description;
    private String title;
    private Double price;
    private String image;
    private String link;

    public String getEventId() {
        return artworkId;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public RegisterArtwork(String artworkId, String artistId, String type, String description, String title, Double price, String image, String link) {
        this.artworkId = artworkId;
        this.artistId = artistId;
        this.type = type;
        this.description = description;
        this.title = title;
        this.price = price;
        this.image = image;
        this.link = link;
    }
}
