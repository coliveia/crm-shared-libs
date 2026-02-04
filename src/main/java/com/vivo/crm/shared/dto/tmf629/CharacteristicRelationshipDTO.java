package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Characteristic Relationship DTO - TMF629
 * Representa o relacionamento entre características
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacteristicRelationshipDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;
}
