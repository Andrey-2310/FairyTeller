package com.rad.fairyteller.domain.book;

public enum GenreType {
    ADVENTURE("ADVENTURE"),
    DETECTIVE("DETECTIVE"),
    FANTASY("FANTASY"),
    HORROR("HORROR");

    private String value;

    GenreType(final String value) {
        this.value = value;
    }

}
