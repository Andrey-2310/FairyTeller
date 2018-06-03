package com.rad.fairyteller.mapping.mapper;

import com.rad.fairyteller.domain.book.Chapter;
import com.rad.fairyteller.mapping.dto.ChapterDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ChapterMapper extends EntityMapper<ChapterDto, Chapter> {
    @Mappings({
            @Mapping(target = "workId", source = "chapter.work.id")
    })
    ChapterDto toDto(Chapter chapter);
}
