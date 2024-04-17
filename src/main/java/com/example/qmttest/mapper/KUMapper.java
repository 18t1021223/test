package com.example.qmttest.mapper;

import com.example.qmttest.api.v1.company.dto.response.KUDto;
import com.example.qmttest.entity.KU;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KUMapper {

    KUMapper INSTANCE = Mappers.getMapper(KUMapper.class);

    KU toEntity(KUDto KUDto);

    KUDto toDto(KU KU);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    KU partialUpdate(KUDto KUDto, @MappingTarget KU KU);
}