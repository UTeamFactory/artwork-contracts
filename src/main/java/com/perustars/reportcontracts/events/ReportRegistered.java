package com.perustars.reportcontracts.events;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.Instant;

@Value
public class ReportRegistered {

    private String reportId;

    private String artistId;

    private String hobbyistId;

    private String response;

    private String description;

    private Boolean state;

    private Instant occurredOn;
}
