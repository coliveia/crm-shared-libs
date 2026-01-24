package com.vivo.crm.shared.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Utilitário para geração de IDs únicos
 */
public class IdGenerator {
    
    private static final AtomicLong SEQUENCE = new AtomicLong(0);
    private static final DateTimeFormatter PROTOCOL_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    
    /**
     * Gera um UUID aleatório
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
    
    /**
     * Gera um protocolo único no formato: YYYYMMDDNNNN
     * Exemplo: 202601240001
     */
    public static String generateProtocol() {
        String datePart = LocalDateTime.now().format(PROTOCOL_FORMATTER);
        long sequence = SEQUENCE.incrementAndGet() % 10000; // Reset a cada 10000
        return String.format("%s%04d", datePart, sequence);
    }
    
    /**
     * Gera um ID de Case no formato: CASE-YYYY-NNNNNN
     * Exemplo: CASE-2026-000001
     */
    public static String generateCaseId() {
        String year = String.valueOf(LocalDateTime.now().getYear());
        long sequence = SEQUENCE.incrementAndGet() % 1000000;
        return String.format("CASE-%s-%06d", year, sequence);
    }
    
    /**
     * Gera um ID de evento
     */
    public static String generateEventId() {
        return "EVT-" + generateUUID();
    }
    
    /**
     * Gera um ID de interação
     */
    public static String generateInteractionId() {
        return "INT-" + generateUUID();
    }
}
