package com.example.jpaalcalatfg.mappers;

import com.example.jpaalcalatfg.dto.CapturaDto;
import com.example.jpaalcalatfg.entities.Captura;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CapturaMapper {
    Captura toEntity(CapturaDto capturaDto);

    @AfterMapping
    default void linkClimas(@MappingTarget Captura captura) {
        captura.getClimas().forEach(clima -> clima.setCaptura(captura));
    }

    @AfterMapping
    default void linkMetodosPescas(@MappingTarget Captura captura) {
        captura.getMetodosPescas().forEach(metodosPesca -> metodosPesca.setCaptura(captura));
    }

    CapturaDto toDto(Captura captura);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Captura partialUpdate(CapturaDto capturaDto, @MappingTarget Captura captura);
}