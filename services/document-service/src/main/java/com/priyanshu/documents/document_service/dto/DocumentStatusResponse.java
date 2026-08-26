package com.documentsearchu.documents.document_service.dto;

import java.util.UUID;

import com.documentsearchu.documents.document_service.entity.DocumentStatus;

public record DocumentStatusResponse(UUID documentId, DocumentStatus status) {

}
