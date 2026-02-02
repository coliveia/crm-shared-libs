package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Customer DTO - TMF629 Customer Management API
 * Representa um cliente conforme especificação TMF629
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("type")
    private String type; // "Individual" ou "Organization"

    @JsonProperty("status")
    private String status; // "prospect", "active", "suspended", "closed"

    @JsonProperty("segment")
    private String segment;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("preferredChannel")
    private String preferredChannel;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zipCode")
    private String zipCode;

    @JsonProperty("riskLevel")
    private String riskLevel;

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

    @JsonProperty("contactMedium")
    private List<ContactMediumDTO> contactMedium;

    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    @JsonProperty("creditProfile")
    private List<CreditProfileDTO> creditProfile;

    @JsonProperty("relatedParty")
    private List<RelatedPartyDTO> relatedParty;

    @JsonProperty("accountRef")
    private List<AccountRefDTO> accountRef;
}
