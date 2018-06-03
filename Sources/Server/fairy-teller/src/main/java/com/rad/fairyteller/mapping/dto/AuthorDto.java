package com.rad.fairyteller.mapping.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthorDto {
    private Long id;
    private UserDto userDto;
    private List<WorkDto> works;
}
