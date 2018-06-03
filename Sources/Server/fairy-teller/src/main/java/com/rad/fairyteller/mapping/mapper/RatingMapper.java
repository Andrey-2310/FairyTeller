package com.rad.fairyteller.mapping.mapper;

import com.rad.fairyteller.domain.book.Rating;
import com.rad.fairyteller.mapping.dto.RatingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RatingMapper extends EntityMapper<RatingDto, Rating> {
    @Mappings({
            @Mapping(target = "userId", source = "rating.user.id"),
            @Mapping(target = "workId", source = "rating.work.id"),
    })
    RatingDto toDto(Rating rating);
}
