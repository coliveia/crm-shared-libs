package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * NoteDTO - TMF621 Trouble Ticket Management API
 * Representa uma nota/comentário associado a um Trouble Ticket
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("text")
    private String text;

    @JsonProperty("author")
    private String author;

    @JsonProperty("date")
    private LocalDateTime date;

    @JsonProperty("system")
    private Boolean system; // true se é uma nota do sistema

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
