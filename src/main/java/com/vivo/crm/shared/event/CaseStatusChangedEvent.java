package com.vivo.crm.shared.event;

import com.vivo.crm.shared.enums.CaseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Evento disparado quando o status de um Case muda
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CaseStatusChangedEvent extends DomainEvent {
    
    private CaseStatus previousStatus;
    private CaseStatus newStatus;
    private String reason;
    private String changedBy;
}
