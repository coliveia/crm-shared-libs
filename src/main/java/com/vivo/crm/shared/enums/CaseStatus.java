package com.vivo.crm.shared.enums;

/**
 * Status do Case no ciclo de vida
 */
public enum CaseStatus {
    CREATED("Criado", "Case foi criado e aguarda atribuição"),
    ASSIGNED("Atribuído", "Case foi atribuído a um atendente"),
    IN_PROGRESS("Em Andamento", "Case está sendo trabalhado"),
    SUSPENDED("Suspenso", "Case está aguardando informação externa"),
    ESCALATED("Escalado", "Case foi escalado para nível superior"),
    RESOLVED("Resolvido", "Case foi resolvido"),
    CLOSED("Fechado", "Case foi fechado"),
    REOPENED("Reaberto", "Case foi reaberto após fechamento");

    private final String displayName;
    private final String description;

    CaseStatus(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Valida se a transição de status é permitida
     */
    public boolean canTransitionTo(CaseStatus targetStatus) {
        return switch (this) {
            case CREATED -> targetStatus == ASSIGNED;
            case ASSIGNED -> targetStatus == IN_PROGRESS || targetStatus == SUSPENDED;
            case IN_PROGRESS -> targetStatus == SUSPENDED || targetStatus == ESCALATED || 
                               targetStatus == RESOLVED;
            case SUSPENDED -> targetStatus == IN_PROGRESS || targetStatus == ESCALATED;
            case ESCALATED -> targetStatus == IN_PROGRESS || targetStatus == RESOLVED;
            case RESOLVED -> targetStatus == CLOSED || targetStatus == REOPENED;
            case CLOSED -> targetStatus == REOPENED;
            case REOPENED -> targetStatus == IN_PROGRESS;
        };
    }
}
