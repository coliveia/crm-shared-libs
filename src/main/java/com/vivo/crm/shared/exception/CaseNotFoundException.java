package com.vivo.crm.shared.exception;

/**
 * Exceção lançada quando um Case não é encontrado
 */
public class CaseNotFoundException extends CRMException {
    
    public CaseNotFoundException(String caseId) {
        super(
            String.format("Case with ID '%s' not found", caseId),
            "CASE_NOT_FOUND",
            404
        );
    }
}
