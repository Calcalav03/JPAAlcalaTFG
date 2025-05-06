package com.example.jpaalcalatfg.mappers;

import com.example.jpaalcalatfg.dto.CeboDto;
import com.example.jpaalcalatfg.entities.Cebo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CeboMapper {
    Cebo toEntity(CeboDto ceboDto);

    CeboDto toDto(Cebo cebo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Cebo partialUpdate(CeboDto ceboDto, @MappingTarget Cebo cebo);
}