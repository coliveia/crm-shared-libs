package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Credit Profile DTO - TMF629/TMF669
 * Representa o perfil de crédito do cliente
 * 
 * Campos adicionados conforme planilha CamposParaAdicionar.xlsx:
 * - creditRiskRating: Rating de risco de crédito (TMF669)
 * - creditProfileDate: Data do perfil de crédito (TMF629)
 * - validFor: Período de validade do perfil
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditProfileDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("creditLimit")
    private BigDecimal creditLimit;

    /**
     * Score de crédito do cliente (TMF669 PartyRole.creditScore)
     * Exemplo: 750 pontos
     * Representa o histórico do cliente na Vivo (compras, pagamentos)
     */
    @JsonProperty("creditScore")
    private Integer creditScore;

    /**
     * Rating de risco de crédito (TMF629 CreditProfile.creditRiskRating)
     * Valores típicos: 1-10 onde 1 é baixo risco e 10 é alto risco
     */
    @JsonProperty("creditRiskRating")
    private Integer creditRiskRating;

    /**
     * Data em que o perfil de crédito foi calculado/atualizado
     * (TMF629 CreditProfile.creditProfileDate)
     */
    @JsonProperty("creditProfileDate")
    private LocalDateTime creditProfileDate;

    @JsonProperty("status")
    private String status;

    /**
     * Período de validade do perfil de crédito
     */
    @JsonProperty("validFor")
    private TimePeriodDTO validFor;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;
}
