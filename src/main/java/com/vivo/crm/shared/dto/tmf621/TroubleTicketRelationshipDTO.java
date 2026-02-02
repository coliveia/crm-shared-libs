package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TroubleTicketRelationshipDTO - TMF621 Trouble Ticket Management API
 * Representa um relacionamento entre Trouble Tickets
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketRelationshipDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("relationshipType")
    private String relationshipType; // e.g., "relatedTo", "causedBy", "resolvedBy"

    @JsonProperty("troubleTicket")
    private TroubleTicketRefDTO troubleTicket;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
