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
 * TroubleTicketCreateDTO - TMF621 Trouble Ticket Management API
 * DTO para criação de um novo Trouble Ticket
 * Contém apenas os campos necessários para criação (sem id, href, etc)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketCreateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("severity")
    private String severity; // TroubleTicketSeverityType

    @JsonProperty("priority")
    private String priority; // TroubleTicketPriorityType

    @JsonProperty("ticketType")
    private String ticketType; // TroubleTicketTypeType

    @JsonProperty("expectedResolutionDate")
    private LocalDateTime expectedResolutionDate;

    @JsonProperty("requestedResolutionDate")
    private LocalDateTime requestedResolutionDate;

    @JsonProperty("relatedParty")
    private List<RelatedPartyDTO> relatedParty;

    @JsonProperty("relatedEntity")
    private List<RelatedEntityDTO> relatedEntity;

    @JsonProperty("troubleTicketSpecification")
    private TroubleTicketSpecificationRefDTO troubleTicketSpecification;

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
