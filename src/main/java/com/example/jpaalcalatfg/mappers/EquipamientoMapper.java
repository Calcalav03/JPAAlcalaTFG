package com.example.jpaalcalatfg.mappers;

import com.example.jpaalcalatfg.dto.EquipamientoDto;
import com.example.jpaalcalatfg.entities.Equipamiento;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EquipamientoMapper {
    Equipamiento toEntity(EquipamientoDto equipamientoDto);

    EquipamientoDto toDto(Equipamiento equipamiento);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Equipamiento partialUpdate(EquipamientoDto equipamientoDto, @MappingTarget Equipamiento equipamiento);
}