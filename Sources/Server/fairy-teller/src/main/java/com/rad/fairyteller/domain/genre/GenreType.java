package com.rad.fairyteller.domain.genre;

public enum GenreType {
    ADVENTURE("ADVENTURE"),
    DETECTIVE("DETECTIVE"),
    FANTASY("FANTASY"),
    HORROR("HORROR");

    private String value;

    GenreType(String value) {
        this.value = value;
    }

}
