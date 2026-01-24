package com.vivo.crm.shared.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;

/**
 * DTO para eventos do Case (Event Sourcing)
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseEventDTO {
    
    private String eventId;
    private String caseId;
    private String eventType;
    
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Instant timestamp;
    
    private Long sequence;
    
    private ActorInfo actor;
    private Map<String, Object> data;
    
    private String correlationId;
    private String causationId;
    private Integer aggregateVersion;
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ActorInfo {
        private String type; // AGENT, SYSTEM, CUSTOMER, COPILOT
        private String id;
    }
}
