package com.example.qmttest.api.v1.company;

import com.example.qmttest.api.v1.company.dto.request.CompanyCreateDto;
import com.example.qmttest.api.v1.company.dto.request.CompanySearchDto;
import com.example.qmttest.api.v1.company.dto.request.CompanyUpdateDto;
import com.example.qmttest.api.v1.company.service.CompanyService;
import com.example.qmttest.dto.response.DataRes;
import com.example.qmttest.dto.response.DataRes.PageDataRes;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author NhatPA
 * @since 16/04/2024 - 15:48
 */
@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("/api/v1/companies")
public class CompanyController {
    private final CompanyService companyService;

    @Operation(description = "Retrieve a list of data")
    @GetMapping
    PageDataRes<?> retrieveData(@Valid @ParameterObject CompanySearchDto req) {
        return PageDataRes.ok(companyService.retrieveData(req));
    }

    @Operation(description = "Create a new data")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    DataRes<String> createNewData(@Valid @RequestBody CompanyCreateDto req) {
        companyService.createNewData(req);
        return DataRes.ok();
    }

    @Operation(description = "Update data")
    @PutMapping
    DataRes<String> updateData(@Valid @RequestBody CompanyUpdateDto req) {
        companyService.updateData(req);
        return DataRes.ok();
    }
}
