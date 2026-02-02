package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * RelatedEntityDTO - TMF621 Trouble Ticket Management API
 * Representa uma entidade relacionada a um Trouble Ticket
 * (e.g., bill, product, productOrder, customer)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatedEntityDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("role")
    private String role; // e.g., "bill", "product", "productOrder", "customer"

    @JsonProperty("@referredType")
    private String referredType; // Tipo da entidade referenciada

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
