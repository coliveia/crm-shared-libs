package com.vivo.crm.shared.dto.tmf683;

/**
 * PartyInteractionStatusType - TMF683 Party Interaction Management API
 * Enum dos possíveis status de uma Party Interaction
 */
public enum PartyInteractionStatusType {
    INITIATED("initiated", "Interação iniciada"),
    ACTIVE("active", "Interação ativa/em andamento"),
    SUSPENDED("suspended", "Interação suspensa"),
    COMPLETED("completed", "Interação concluída"),
    CANCELLED("cancelled", "Interação cancelada"),
    FAILED("failed", "Interação falhou");

    private final String value;
    private final String description;

    PartyInteractionStatusType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static PartyInteractionStatusType fromValue(String value) {
        for (PartyInteractionStatusType status : PartyInteractionStatusType.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid PartyInteractionStatusType: " + value);
    }
}
