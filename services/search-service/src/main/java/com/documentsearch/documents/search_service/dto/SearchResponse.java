package com.documentsearchu.documents.search_service.dto;

import java.util.List;

public record SearchResponse(
    long total,
    List<SearchResultItem> results
) {

}
