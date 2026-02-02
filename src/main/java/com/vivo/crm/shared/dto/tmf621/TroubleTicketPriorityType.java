package com.vivo.crm.shared.dto.tmf621;

/**
 * TroubleTicketPriorityType - TMF621 Trouble Ticket Management API
 * Enum dos níveis de prioridade de um Trouble Ticket
 */
public enum TroubleTicketPriorityType {
    CRITICAL("Critical", "Máxima prioridade - resolução imediata"),
    HIGH("High", "Alta prioridade - resolução rápida"),
    MEDIUM("Medium", "Prioridade média - resolução normal"),
    LOW("Low", "Baixa prioridade - resolução quando possível");

    private final String value;
    private final String description;

    TroubleTicketPriorityType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static TroubleTicketPriorityType fromValue(String value) {
        for (TroubleTicketPriorityType priority : TroubleTicketPriorityType.values()) {
            if (priority.value.equalsIgnoreCase(value)) {
                return priority;
            }
        }
        throw new IllegalArgumentException("Invalid TroubleTicketPriorityType: " + value);
    }
}
