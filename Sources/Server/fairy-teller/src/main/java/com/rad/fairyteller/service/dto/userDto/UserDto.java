package com.rad.fairyteller.service.dto.userDto;

import com.rad.fairyteller.service.dto.authorDto.AuthorDto;
import com.rad.fairyteller.service.dto.purchaseDto.PurchaseDto;
import lombok.Data;

import java.util.List;
@Data
public class UserDto {
    private Long id;
    private String username;
    private AuthorDto author;
    private List<PurchaseDto> purchases;
}
