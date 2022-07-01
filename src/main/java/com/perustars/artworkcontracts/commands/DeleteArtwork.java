package com.perustars.artworkcontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteArtwork {
    @TargetAggregateIdentifier
    private String artworkId;
}
