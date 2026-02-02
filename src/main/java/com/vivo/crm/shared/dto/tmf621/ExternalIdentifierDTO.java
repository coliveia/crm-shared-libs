package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ExternalIdentifierDTO - TMF621 Trouble Ticket Management API
 * Representa um identificador externo (de outro sistema)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalIdentifierDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("externalSystemId")
    private String externalSystemId; // ID do sistema externo

    @JsonProperty("entityType")
    private String entityType; // Tipo da entidade no sistema externo

    @JsonProperty("externalId")
    private String externalId; // ID único no sistema externo

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
