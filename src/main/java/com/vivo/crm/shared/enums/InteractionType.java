package com.vivo.crm.shared.enums;

/**
 * Tipos de interação com o cliente
 */
public enum InteractionType {
    CALL("Chamada Telefônica"),
    EMAIL("E-mail"),
    CHAT("Chat Online"),
    SMS("SMS"),
    WHATSAPP("WhatsApp"),
    NOTE("Nota Interna"),
    COPILOT_SUGGESTION("Sugestão do Copilot");

    private final String displayName;

    InteractionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
