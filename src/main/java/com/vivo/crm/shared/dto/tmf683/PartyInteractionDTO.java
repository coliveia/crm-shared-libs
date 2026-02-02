package com.vivo.crm.shared.dto.tmf683;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vivo.crm.shared.dto.tmf629.CharacteristicDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * PartyInteractionDTO - TMF683 Party Interaction Management API
 * Representa uma interação entre partes (customer, agent, etc.)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyInteractionDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status; // initiated, active, suspended, completed, cancelled, failed

    @JsonProperty("statusChangeDate")
    private LocalDateTime statusChangeDate;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("channel")
    private String channel; // phone, email, chat, web, mobile, socialMedia, video, inPerson, sms, whatsapp

    @JsonProperty("direction")
    private String direction; // inbound, outbound, internal

    @JsonProperty("initiationDate")
    private LocalDateTime initiationDate;

    @JsonProperty("completionDate")
    private LocalDateTime completionDate;

    @JsonProperty("duration")
    private Long duration; // em segundos

    @JsonProperty("priority")
    private String priority; // high, medium, low

    @JsonProperty("satisfaction")
    private String satisfaction; // satisfied, neutral, dissatisfied

    @JsonProperty("originatingParty")
    private PartyRefDTO originatingParty;

    @JsonProperty("relatedParty")
    private List<PartyRefDTO> relatedParty;

    @JsonProperty("relatedEntity")
    private List<Map<String, Object>> relatedEntity; // Entidades relacionadas (ticket, order, etc.)

    @JsonProperty("partyInteractionRelationship")
    private List<PartyInteractionRefDTO> partyInteractionRelationship;

    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    @JsonProperty("note")
    private List<Map<String, Object>> note; // Notas/comentários

    @JsonProperty("attachment")
    private List<Map<String, Object>> attachment; // Arquivos anexados

    @JsonProperty("contextData")
    private Map<String, Object> contextData;

    @JsonProperty("createdAt")
    private LocalDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("updatedAt")
    private LocalDateTime updatedAt;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
