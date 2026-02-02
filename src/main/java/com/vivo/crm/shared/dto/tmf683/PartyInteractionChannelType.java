package com.vivo.crm.shared.dto.tmf683;

/**
 * PartyInteractionChannelType - TMF683 Party Interaction Management API
 * Enum dos canais de interação
 */
public enum PartyInteractionChannelType {
    PHONE("phone", "Interação via telefone"),
    EMAIL("email", "Interação via email"),
    CHAT("chat", "Interação via chat/mensagem"),
    WEB("web", "Interação via web/portal"),
    MOBILE("mobile", "Interação via aplicativo mobile"),
    SOCIAL_MEDIA("socialMedia", "Interação via redes sociais"),
    VIDEO("video", "Interação via videoconferência"),
    IN_PERSON("inPerson", "Interação presencial"),
    SMS("sms", "Interação via SMS"),
    WHATSAPP("whatsapp", "Interação via WhatsApp");

    private final String value;
    private final String description;

    PartyInteractionChannelType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static PartyInteractionChannelType fromValue(String value) {
        for (PartyInteractionChannelType channel : PartyInteractionChannelType.values()) {
            if (channel.value.equalsIgnoreCase(value)) {
                return channel;
            }
        }
        throw new IllegalArgumentException("Invalid PartyInteractionChannelType: " + value);
    }
}
