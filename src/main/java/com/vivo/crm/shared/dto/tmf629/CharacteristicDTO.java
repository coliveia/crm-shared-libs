package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Characteristic DTO - TMF629/TMF632
 * Representa uma característica customizada do cliente
 * 
 * Usado para campos específicos de negócio conforme planilha:
 * - segmentation: Tipo de cliente (Purpura, Platinum, Silver)
 * - biometriaColetada: Status da biometria do cliente
 * - codigoGrupo: Código do grupo/hierarquia da empresa
 * - nomeGrupo: Nome do grupo (CORPORATE, GOVERNO)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacteristicDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    /**
     * Nome da característica
     * Exemplos: "segmentation", "biometriaColetada", "codigoGrupo", "nomeGrupo"
     */
    @JsonProperty("name")
    private String name;

    /**
     * Valor da característica
     * Exemplos: "gold", "true", "4042591651", "CORPORATE"
     */
    @JsonProperty("value")
    private String value;

    /**
     * Tipo do valor da característica
     * Valores: "string", "boolean", "number", "date"
     */
    @JsonProperty("valueType")
    private String valueType;

    /**
     * Relacionamentos com outras características
     */
    @JsonProperty("characteristicRelationship")
    private List<CharacteristicRelationshipDTO> characteristicRelationship;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;
}
