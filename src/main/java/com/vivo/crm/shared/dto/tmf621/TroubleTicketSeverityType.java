package com.vivo.crm.shared.dto.tmf621;

/**
 * TroubleTicketSeverityType - TMF621 Trouble Ticket Management API
 * Enum dos níveis de severidade de um Trouble Ticket
 */
public enum TroubleTicketSeverityType {
    CRITICAL("Critical", "Impacto crítico no sistema/serviço"),
    MAJOR("Major", "Impacto significativo"),
    MINOR("Minor", "Impacto mínimo");

    private final String value;
    private final String description;

    TroubleTicketSeverityType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static TroubleTicketSeverityType fromValue(String value) {
        for (TroubleTicketSeverityType severity : TroubleTicketSeverityType.values()) {
            if (severity.value.equalsIgnoreCase(value)) {
                return severity;
            }
        }
        throw new IllegalArgumentException("Invalid TroubleTicketSeverityType: " + value);
    }
}
