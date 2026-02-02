package com.vivo.crm.shared.dto.tmf683;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * PartyInteractionRefDTO - TMF683 Party Interaction Management API
 * Referência a uma Party Interaction
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyInteractionRefDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("@referredType")
    private String referredType;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
