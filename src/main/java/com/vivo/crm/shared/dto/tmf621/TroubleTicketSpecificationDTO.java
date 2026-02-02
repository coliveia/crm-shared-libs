package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vivo.crm.shared.dto.tmf629.CharacteristicDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * TroubleTicketSpecificationDTO - TMF621 Trouble Ticket Management API
 * Representa uma especificação/template de Trouble Ticket
 * Define os campos padrão e validações para criar novos tickets
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketSpecificationDTO implements Serializable {

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

    @JsonProperty("defaultSeverity")
    private String defaultSeverity;

    @JsonProperty("defaultPriority")
    private String defaultPriority;

    @JsonProperty("defaultTicketType")
    private String defaultTicketType;

    @JsonProperty("expectedResolutionDateDefault")
    private Long expectedResolutionDateDefault; // em minutos

    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    @JsonProperty("contextData")
    private String contextData; // JSON schema para campos customizados

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
