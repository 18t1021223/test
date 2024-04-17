package com.example.qmttest.mapper;

import com.example.qmttest.api.v1.company.dto.response.FSDto;
import com.example.qmttest.entity.FS;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FSMapper {
    FSMapper INSTANCE = Mappers.getMapper(FSMapper.class);

    FS toEntity(FSDto FSDto);

    FSDto toDto(FS FS);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FS partialUpdate(FSDto FSDto, @MappingTarget FS FS);
}