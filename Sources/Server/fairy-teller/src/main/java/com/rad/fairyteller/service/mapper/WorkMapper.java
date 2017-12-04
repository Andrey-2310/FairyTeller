package com.rad.fairyteller.service.mapper;

import com.rad.fairyteller.domain.genre.Genre;
import com.rad.fairyteller.domain.genre.GenreType;
import com.rad.fairyteller.domain.language.Language;
import com.rad.fairyteller.domain.language.LanguageType;
import com.rad.fairyteller.domain.work.Work;
import com.rad.fairyteller.service.dto.workDto.WorkDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkMapper extends EntityMapper<WorkDto, Work>{

    @Mappings({
            @Mapping(target = "authorName", source = "work.author.user.username")
    })
    WorkDto toDto(Work work);

    default List<String> mapGenreList(List<Genre> genres){
        List<String> stringGenres = new ArrayList<>();
        for(Genre genre: genres){
            stringGenres.add(genre.getGenreType().toString());
        }
        return stringGenres;
    }

    default Genre mapGenreFromString(String genreString){
        Genre genre = new Genre();
        GenreType genreType = GenreType.valueOf(genreString);
        genre.setGenreType(genreType);
        return genre;
    }

    default String mapLanguageToString(Language language){
        return language.getLanguageType().toString();
    }

    default Language mapStringToLanguage(String string){
        Language language = new Language();
        LanguageType languageType = LanguageType.valueOf(string);
        language.setLanguageType(languageType);
        return language;
    }

}
