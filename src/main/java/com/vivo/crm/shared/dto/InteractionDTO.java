package com.vivo.crm.shared.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.vivo.crm.shared.enums.InteractionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO para interações do Case
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InteractionDTO {
    
    private String interactionId;
    private String caseId;
    
    private InteractionType type;
    private String channel;
    private String direction; // INBOUND, OUTBOUND, INTERNAL
    
    private String subject;
    private String content;
    private String summary; // Gerado por LLM
    private String sentiment; // POSITIVE, NEUTRAL, NEGATIVE, FRUSTRATED
    
    private String agentId;
    private String customerId;
    
    private Integer durationSeconds;
    private String recordingUrl;
    private String transcriptUrl;
    
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Instant createdAt;
}
