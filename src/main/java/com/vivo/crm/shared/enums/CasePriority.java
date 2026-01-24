package com.vivo.crm.shared.enums;

/**
 * Prioridade do Case
 */
public enum CasePriority {
    LOW("Baixa", 4, 48),           // 4h response, 48h resolution
    MEDIUM("Média", 2, 24),        // 2h response, 24h resolution
    HIGH("Alta", 1, 8),            // 1h response, 8h resolution
    CRITICAL("Crítica", 0.5, 4);   // 30min response, 4h resolution

    private final String displayName;
    private final double responseTimeHours;
    private final double resolutionTimeHours;

    CasePriority(String displayName, double responseTimeHours, double resolutionTimeHours) {
        this.displayName = displayName;
        this.responseTimeHours = responseTimeHours;
        this.resolutionTimeHours = resolutionTimeHours;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getResponseTimeHours() {
        return responseTimeHours;
    }

    public double getResolutionTimeHours() {
        return resolutionTimeHours;
    }
}
