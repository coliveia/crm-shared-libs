package com.vivo.crm.shared.dto.tmf621;

/**
 * TroubleTicketStatusType - TMF621 Trouble Ticket Management API
 * Enum dos possíveis status de um Trouble Ticket
 */
public enum TroubleTicketStatusType {
    ACKNOWLEDGED("acknowledged", "Ticket foi reconhecido pelo sistema"),
    REJECTED("rejected", "Ticket foi rejeitado"),
    PENDING("pending", "Ticket aguardando informações adicionais"),
    HELD("held", "Ticket em espera"),
    IN_PROGRESS("inProgress", "Ticket em processamento"),
    CANCELLED("cancelled", "Ticket foi cancelado"),
    CLOSED("closed", "Ticket foi fechado"),
    RESOLVED("resolved", "Ticket foi resolvido");

    private final String value;
    private final String description;

    TroubleTicketStatusType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static TroubleTicketStatusType fromValue(String value) {
        for (TroubleTicketStatusType status : TroubleTicketStatusType.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid TroubleTicketStatusType: " + value);
    }
}
