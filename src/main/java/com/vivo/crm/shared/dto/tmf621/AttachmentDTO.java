package com.vivo.crm.shared.dto.tmf621;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * AttachmentDTO - TMF621 Trouble Ticket Management API
 * Representa um arquivo anexado a um Trouble Ticket
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("attachmentType")
    private String attachmentType; // e.g., "logo", "instructionManual", "contractCopy"

    @JsonProperty("content")
    private String content; // Base64 encoded

    @JsonProperty("mimeType")
    private String mimeType;

    @JsonProperty("size")
    private Long size;

    @JsonProperty("url")
    private String url;

    @JsonProperty("uploadedDate")
    private LocalDateTime uploadedDate;

    @JsonProperty("uploadedBy")
    private String uploadedBy;

    @JsonProperty("validFor")
    private TimePeriodDTO validFor;

    @JsonProperty("@baseType")
    private String baseType;

    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
}
