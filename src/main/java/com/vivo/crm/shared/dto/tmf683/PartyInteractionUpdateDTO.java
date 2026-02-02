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
 * PartyInteractionUpdateDTO - TMF683 Party Interaction Management API
 * DTO para atualização parcial de uma Party Interaction
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyInteractionUpdateDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private String status;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("satisfaction")
    private String satisfaction;

    @JsonProperty("completionDate")
    private LocalDateTime completionDate;

    @JsonProperty("duration")
    private Long duration;

    @JsonProperty("relatedParty")
    private List<PartyRefDTO> relatedParty;

    @JsonProperty("relatedEntity")
    private List<Map<String, Object>> relatedEntity;

    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    @JsonProperty("note")
    private List<Map<String, Object>> note;

    @JsonProperty("attachment")
    private List<Map<String, Object>> attachment;

    @JsonProperty("contextData")
    private Map<String, Object> contextData;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
