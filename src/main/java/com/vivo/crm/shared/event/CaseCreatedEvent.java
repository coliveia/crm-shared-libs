package com.vivo.crm.shared.event;

import com.vivo.crm.shared.enums.CasePriority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * Evento disparado quando um Case é criado
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CaseCreatedEvent extends DomainEvent {
    
    private String protocol;
    private String caseType;
    private String category;
    private String subcategory;
    private CasePriority priority;
    
    private String customerId;
    private String customerSegment;
    
    private String createdBy;
    private Map<String, Object> context;
}
