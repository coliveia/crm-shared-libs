package com.vivo.crm.shared.exception;

import lombok.Getter;

/**
 * Exceção base para todas as exceções do CRM
 */
@Getter
public class CRMException extends RuntimeException {
    
    private final String errorCode;
    private final int httpStatus;
    
    public CRMException(String message, String errorCode, int httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }
    
    public CRMException(String message, String errorCode, int httpStatus, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }
}
