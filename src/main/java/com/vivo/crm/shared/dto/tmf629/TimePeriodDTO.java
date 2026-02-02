package com.vivo.crm.shared.dto.tmf629;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimePeriodDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("startDateTime")
    private LocalDateTime startDateTime;

    @JsonProperty("endDateTime")
    private LocalDateTime endDateTime;
}
