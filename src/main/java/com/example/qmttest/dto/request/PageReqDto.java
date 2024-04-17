package com.example.qmttest.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.example.qmttest.utils.PaginationUtil.DEFAULT_RECORD_PER_PAGE;
import static com.example.qmttest.utils.PaginationUtil.MAX_LIMIT_SIZE;

/**
 * PageReqDto represents a request object for paginated data retrieval.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageReqDto {

    @Schema(description = "Default value: 1")
    private Integer page;

    @Schema(description = "Default value: " + DEFAULT_RECORD_PER_PAGE + ", Max value: " + MAX_LIMIT_SIZE)
    private Integer limit;

    @Schema(description = "Each item in the array is formatted as Column-Direction, Default value: id-asc", type = "array")
    private String[] sorts;
}
