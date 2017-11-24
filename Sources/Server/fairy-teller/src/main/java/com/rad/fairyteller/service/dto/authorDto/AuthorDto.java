package com.rad.fairyteller.service.dto.authorDto;

import com.rad.fairyteller.service.dto.userDto.UserDto;
import com.rad.fairyteller.service.dto.workDto.WorkDto;
import lombok.Data;

import java.util.List;

@Data
public class AuthorDto {
    private Long id;
    private UserDto userDto;
    private List<WorkDto> works;
}
