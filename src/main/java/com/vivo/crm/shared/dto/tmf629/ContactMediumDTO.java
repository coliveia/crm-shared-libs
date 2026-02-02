package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactMediumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type; // "phone", "email", "address"

    @JsonProperty("preferred")
    private Boolean preferred;

    @JsonProperty("value")
    private String value;

    @JsonProperty("validFor")
    private TimePeriodDTO validFor;
}
