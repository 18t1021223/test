package com.example.qmttest.api.v1.company.service;

import com.example.qmttest.api.v1.company.dto.request.CompanyCreateDto;
import com.example.qmttest.api.v1.company.dto.request.CompanySearchDto;
import com.example.qmttest.api.v1.company.dto.request.CompanyUpdateDto;
import com.example.qmttest.dto.response.PageRes;
import com.example.qmttest.repository.FSRepository;
import com.example.qmttest.repository.KURepository;
import com.example.qmttest.repository.OERepository;
import com.example.qmttest.utils.PaginationUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author NhatPA
 * @since 16/04/2024 - 16:25
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CompanyService {
    private final FSRepository fsRepository;
    private final KURepository kuRepository;
    private final OERepository oeRepository;
    @Transactional(readOnly = true)
    public PageRes<?> retrieveData(CompanySearchDto req) {
        return PaginationUtil.buildPageRes(
                null
        );
    }

    @Transactional(rollbackFor = Exception.class)
    public void createNewData(CompanyCreateDto req) {
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateData(CompanyUpdateDto req) {
    }
}
