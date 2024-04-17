package com.example.qmttest.api.v1.company.dto.request;

import com.example.qmttest.dto.request.PageReqDto;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NhatPA
 * @since 16/04/2024 - 16:18
 */
@Getter
@Setter
public class CompanySearchDto extends PageReqDto {
    private String search;
}
