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
 * TroubleTicketUpdateDTO - TMF621 Trouble Ticket Management API
 * DTO para atualização parcial de um Trouble Ticket
 * Todos os campos são opcionais
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status; // TroubleTicketStatusType

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("severity")
    private String severity; // TroubleTicketSeverityType

    @JsonProperty("priority")
    private String priority; // TroubleTicketPriorityType

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

    @JsonProperty("troubleTicketRelationship")
    private List<TroubleTicketRelationshipDTO> troubleTicketRelationship;

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
