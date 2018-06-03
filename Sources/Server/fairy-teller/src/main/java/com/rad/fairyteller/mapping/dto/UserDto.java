package com.rad.fairyteller.mapping.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private AuthorDto author;
    private List<PurchaseDto> purchases;
}
