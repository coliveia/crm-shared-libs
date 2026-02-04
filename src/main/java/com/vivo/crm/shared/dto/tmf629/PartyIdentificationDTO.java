package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Party Identification DTO - TMF632 Party Management API
 * Representa a identificação de uma parte (CPF, CNPJ, RG, etc.)
 * Conforme especificação TMF632 - Individual/Organization Identification
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyIdentificationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    /**
     * Tipo de identificação: CPF, CNPJ, RG, PASSPORT, etc.
     */
    @JsonProperty("identificationType")
    private String identificationType;

    /**
     * Número do documento de identificação (sem formatação)
     */
    @JsonProperty("identificationNumber")
    private String identificationNumber;

    /**
     * Autoridade emissora do documento
     */
    @JsonProperty("issuingAuthority")
    private String issuingAuthority;

    /**
     * Data de emissão do documento
     */
    @JsonProperty("issuingDate")
    private LocalDate issuingDate;

    /**
     * Período de validade do documento
     */
    @JsonProperty("validFor")
    private TimePeriodDTO validFor;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;
}
