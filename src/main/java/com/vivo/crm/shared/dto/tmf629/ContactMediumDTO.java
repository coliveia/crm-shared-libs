package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Contact Medium DTO - TMF629/TMF632
 * Representa um meio de contato do cliente
 * 
 * Campos adicionados conforme planilha CamposParaAdicionar.xlsx:
 * - phoneNumber: Número de telefone específico (TMF632 ContactMediumPhone)
 * - emailAddress: Endereço de email específico (TMF632 EmailContactMedium)
 * - contactType: Tipo de contato mais detalhado
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactMediumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    /**
     * Tipo de meio de contato
     * Valores: "phone", "email", "address", "social"
     */
    @JsonProperty("mediumType")
    private String mediumType;

    /**
     * Tipo de contato mais específico
     * Valores: "mobile", "landline", "work", "home", "fax"
     */
    @JsonProperty("contactType")
    private String contactType;

    /**
     * Indica se é o meio de contato preferido
     */
    @JsonProperty("preferred")
    private Boolean preferred;

    /**
     * Valor genérico do meio de contato
     * @deprecated Use phoneNumber ou emailAddress conforme o tipo
     */
    @Deprecated
    @JsonProperty("value")
    private String value;

    /**
     * Número de telefone (TMF632 ContactMediumPhone.number)
     * Formato: +5511999999999
     * Representa a linha que vai realizar o atendimento (instância)
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * Endereço de email (TMF632 EmailContactMedium.emailAddress)
     */
    @JsonProperty("emailAddress")
    private String emailAddress;

    /**
     * Período de validade do meio de contato
     */
    @JsonProperty("validFor")
    private TimePeriodDTO validFor;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;
}
