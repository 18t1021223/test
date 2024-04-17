package com.example.qmttest.mapper;

import com.example.qmttest.api.v1.company.dto.response.OEDto;
import com.example.qmttest.entity.OE;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OEMapper {
    OEMapper INSTANCE = Mappers.getMapper(OEMapper.class);

    OE toEntity(OEDto OEDto);

    OEDto toDto(OE OE);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    OE partialUpdate(OEDto OEDto, @MappingTarget OE OE);
}