package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Related Party DTO - TMF629/TMF632
 * Representa uma parte relacionada ao cliente (gestor, grupo, etc.)
 * 
 * Campos adicionados conforme planilha CamposParaAdicionar.xlsx:
 * - relationshipType: Tipo de relacionamento (isManagedBy, isMemberOfGroup)
 * - characteristic: Características do relacionamento (codigoGrupo, nomeGrupo)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatedPartyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    /**
     * Papel da parte relacionada
     * Exemplo: "Gestor", "Sócio", "Gestor de contato", "Gestor master"
     */
    @JsonProperty("role")
    private String role;

    /**
     * Tipo de relacionamento conforme TMF632 PartyRelationship
     * Valores: "isManagedBy" (gestor), "isMemberOfGroup" (grupo/hierarquia)
     */
    @JsonProperty("relationshipType")
    private String relationshipType;

    /**
     * Características do relacionamento
     * Para grupos: codigoGrupo, nomeGrupo (CORPORATE, GOVERNO)
     */
    @JsonProperty("characteristic")
    private List<CharacteristicDTO> characteristic;

    /**
     * Período de validade do relacionamento
     */
    @JsonProperty("validFor")
    private TimePeriodDTO validFor;

    @JsonProperty("@referredType")
    private String referredType; // "Customer", "Organization", "User", "Individual"

    @JsonProperty("@type")
    private String type;

    @JsonProperty("@baseType")
    private String baseType;
}
