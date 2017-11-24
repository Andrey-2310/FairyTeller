package com.rad.fairyteller.service.mapper;

import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.service.dto.workDto.WorkDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface WorkMapper extends EntityMapper<WorkDto, Work>{
    WorkMapper INSTANCE = Mappers.getMapper(WorkMapper.class);

    @Mappings({
            @Mapping(target = "authorId", source = "work.author.id")
    })
    WorkDto toDto(Work work);
}
