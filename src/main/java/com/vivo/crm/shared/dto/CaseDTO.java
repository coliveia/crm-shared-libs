package com.vivo.crm.shared.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.vivo.crm.shared.enums.CasePriority;
import com.vivo.crm.shared.enums.CaseStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.Map;

/**
 * DTO principal do Case
 * Representa o agregado completo conforme Duality View
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseDTO {
    
    private String caseId;
    
    @NotBlank(message = "Protocol is required")
    private String protocol;
    
    @NotBlank(message = "Case type is required")
    private String type;
    
    private String category;
    private String subcategory;
    
    @NotNull(message = "Priority is required")
    private CasePriority priority;
    
    @NotNull(message = "Customer information is required")
    private CustomerInfo customer;
    
    @NotNull(message = "State is required")
    private CaseState state;
    
    private SLAInfo sla;
    private AssignmentInfo assignment;
    private WorkflowInfo workflow;
    
    private Map<String, Object> context;
    
    private MetadataInfo metadata;
    
    private List<CaseEventDTO> events;
    private List<InteractionDTO> interactions;
    private List<RelationshipDTO> relationships;
    private List<AttachmentDTO> attachments;
    
    /**
     * Informações do cliente
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerInfo {
        @NotBlank
        private String customerId;
        private String segment;
        private Double lifetimeValue;
        private Double riskScore;
        private String sentiment;
    }
    
    /**
     * Estado atual do case
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CaseState {
        @NotNull
        private CaseStatus status;
        private String stage;
        private String substatus;
    }
    
    /**
     * Informações de SLA
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SLAInfo {
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant responseDue;
        
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant resolutionDue;
        
        private Boolean breached;
        private Boolean paused;
        private String pauseReason;
    }
    
    /**
     * Informações de atribuição
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AssignmentInfo {
        private String assignedTo;
        private String team;
        
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant assignedAt;
    }
    
    /**
     * Informações de workflow
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class WorkflowInfo {
        private String workflowId;
        private String version;
        private String instanceId;
        private String status;
        private Map<String, Object> variables;
    }
    
    /**
     * Metadados de auditoria
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MetadataInfo {
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant createdAt;
        private String createdBy;
        
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant updatedAt;
        private String updatedBy;
        
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant resolvedAt;
        private String resolvedBy;
        
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
        private Instant closedAt;
        private String closedBy;
    }
}
