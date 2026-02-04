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
 * 
 * Campos adicionados conforme planilha CamposParaAdicionar.xlsx:
 * - formattedName: Nome completo do cliente (TMF632 Individual)
 * - givenName: Primeiro nome (TMF632 Individual)
 * - familyName: Sobrenome (TMF632 Individual)
 * - preferredGivenName: Nome de preferência escolhido pelo cliente (TMF632 Individual)
 * - tradingName: Razão social para PJ (TMF632 Organization)
 * - partyIdentification: Lista de identificações (CPF, CNPJ) (TMF632)
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

    // ========== CAMPOS ADICIONADOS - TMF632 Individual ==========

    /**
     * Nome completo formatado do cliente (TMF632 Individual.formattedName)
     * Exemplo: "João da Silva Santos"
     */
    @JsonProperty("formattedName")
    private String formattedName;

    /**
     * Primeiro nome do cliente (TMF632 Individual.givenName)
     * Exemplo: "João"
     */
    @JsonProperty("givenName")
    private String givenName;

    /**
     * Sobrenome/Nome de família (TMF632 Individual.familyName)
     * Exemplo: "Santos"
     */
    @JsonProperty("familyName")
    private String familyName;

    /**
     * Nome de preferência escolhido pelo cliente no APP (TMF632 Individual)
     * Exemplo: "Johne" - nome que o cliente deseja ser chamado
     */
    @JsonProperty("preferredGivenName")
    private String preferredGivenName;

    // ========== CAMPOS ADICIONADOS - TMF632 Organization ==========

    /**
     * Razão Social da empresa (TMF632 Organization.tradingName)
     * Exemplo: "Souza e Silva Ltda"
     */
    @JsonProperty("tradingName")
    private String tradingName;

    // ========== CAMPOS ADICIONADOS - TMF632 Party Identification ==========

    /**
     * Lista de identificações do cliente (CPF, CNPJ, RG, etc.)
     * Conforme TMF632 IndividualIdentification/OrganizationIdentification
     */
    @JsonProperty("partyIdentification")
    private List<PartyIdentificationDTO> partyIdentification;

    // ========== CAMPOS EXISTENTES ==========

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    /**
     * @deprecated Use partyIdentification com identificationType="CPF"
     */
    @Deprecated
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

    // ========== CAMPOS TMF ==========

    @JsonProperty("@type")
    private String atType;

    @JsonProperty("@baseType")
    private String atBaseType;

    @JsonProperty("@schemaLocation")
    private String atSchemaLocation;
}
