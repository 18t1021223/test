package com.example.qmttest.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageRes<T> {
    private Long total;
    private Integer limit;
    private Integer totalPage;
    private Integer page;
    private List<T> records;
}
