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
 * PartyInteractionSpecificationDTO - TMF683 Party Interaction Management API
 * Define templates/especificações para criar novas Party Interactions
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyInteractionSpecificationDTO implements Serializable {

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
    private String status; // inDesign, active, retired, rejected

    @JsonProperty("statusChangeDate")
    private LocalDateTime statusChangeDate;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("creationDate")
    private LocalDateTime creationDate;

    @JsonProperty("lastUpdate")
    private LocalDateTime lastUpdate;

    @JsonProperty("version")
    private String version;

    @JsonProperty("defaultChannel")
    private String defaultChannel;

    @JsonProperty("defaultDirection")
    private String defaultDirection;

    @JsonProperty("defaultPriority")
    private String defaultPriority;

    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    @JsonProperty("contextSchema")
    private Map<String, Object> contextSchema; // JSON schema para campos customizados

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
