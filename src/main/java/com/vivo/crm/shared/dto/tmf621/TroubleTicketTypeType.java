package com.vivo.crm.shared.dto.tmf621;

/**
 * TroubleTicketTypeType - TMF621 Trouble Ticket Management API
 * Enum dos tipos de Trouble Ticket
 */
public enum TroubleTicketTypeType {
    INCIDENT("incident", "Problema/incidente não planejado"),
    COMPLAINT("complaint", "Reclamação do cliente"),
    REQUEST("request", "Solicitação de serviço");

    private final String value;
    private final String description;

    TroubleTicketTypeType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static TroubleTicketTypeType fromValue(String value) {
        for (TroubleTicketTypeType type : TroubleTicketTypeType.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid TroubleTicketTypeType: " + value);
    }
}
