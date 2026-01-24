package com.vivo.crm.shared.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO para relacionamentos entre Cases
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationshipDTO {
    
    private String relationshipId;
    private String sourceCaseId;
    private String targetCaseId;
    private String type; // RELATED_TO, DUPLICATE_OF, CAUSED_BY, BLOCKS, DEPENDS_ON
    
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Instant createdAt;
    private String createdBy;
}
