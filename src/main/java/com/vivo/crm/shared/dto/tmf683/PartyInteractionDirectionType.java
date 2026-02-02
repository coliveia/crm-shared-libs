package com.vivo.crm.shared.dto.tmf683;

/**
 * PartyInteractionDirectionType - TMF683 Party Interaction Management API
 * Enum da direção da interação
 */
public enum PartyInteractionDirectionType {
    INBOUND("inbound", "Interação recebida (entrada)"),
    OUTBOUND("outbound", "Interação iniciada (saída)"),
    INTERNAL("internal", "Interação interna");

    private final String value;
    private final String description;

    PartyInteractionDirectionType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static PartyInteractionDirectionType fromValue(String value) {
        for (PartyInteractionDirectionType direction : PartyInteractionDirectionType.values()) {
            if (direction.value.equalsIgnoreCase(value)) {
                return direction;
            }
        }
        throw new IllegalArgumentException("Invalid PartyInteractionDirectionType: " + value);
    }
}
