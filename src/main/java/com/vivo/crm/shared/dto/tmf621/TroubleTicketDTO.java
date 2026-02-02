package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vivo.crm.shared.dto.tmf629.CharacteristicDTO;
import com.vivo.crm.shared.dto.tmf629.RelatedPartyDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * TroubleTicketDTO - TMF621 Trouble Ticket Management API
 * Representa um Trouble Ticket conforme especificação TMF621
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status; // TroubleTicketStatusType

    @JsonProperty("statusChangeDate")
    private LocalDateTime statusChangeDate;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("statusChangeHistory")
    private List<StatusChangeDTO> statusChangeHistory;

    @JsonProperty("severity")
    private String severity; // TroubleTicketSeverityType

    @JsonProperty("priority")
    private String priority; // TroubleTicketPriorityType

    @JsonProperty("ticketType")
    private String ticketType; // TroubleTicketTypeType

    @JsonProperty("creationDate")
    private LocalDateTime creationDate;

    @JsonProperty("lastUpdate")
    private LocalDateTime lastUpdate;

    @JsonProperty("expectedResolutionDate")
    private LocalDateTime expectedResolutionDate;

    @JsonProperty("requestedResolutionDate")
    private LocalDateTime requestedResolutionDate;

    @JsonProperty("resolutionDate")
    private LocalDateTime resolutionDate;

    @JsonProperty("relatedParty")
    private List<RelatedPartyDTO> relatedParty;

    @JsonProperty("relatedEntity")
    private List<RelatedEntityDTO> relatedEntity;

    @JsonProperty("troubleTicketSpecification")
    private TroubleTicketSpecificationRefDTO troubleTicketSpecification;

    @JsonProperty("troubleTicketRelationship")
    private List<TroubleTicketRelationshipDTO> troubleTicketRelationship;

    @JsonProperty("channel")
    private ChannelRefDTO channel;

    @JsonProperty("externalIdentifier")
    private List<ExternalIdentifierDTO> externalIdentifier;

    @JsonProperty("note")
    private List<NoteDTO> note;

    @JsonProperty("attachment")
    private List<AttachmentDTO> attachment;

    @JsonProperty("troubleTicketCharacteristic")
    private List<CharacteristicDTO> troubleTicketCharacteristic;

    @JsonProperty("contextData")
    private Map<String, Object> contextData;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
