package com.vivo.crm.shared.dto.tmf683;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * PartyRefDTO - TMF683 Party Interaction Management API
 * Referência a uma Party (Customer, Organization, User)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyRefDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("role")
    private String role; // e.g., "customer", "agent", "supervisor", "organization"

    @JsonProperty("@referredType")
    private String referredType; // "Customer", "Organization", "User"

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
