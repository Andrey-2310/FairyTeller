package com.rad.fairyteller.domain.book;

public enum LanguageType {
    EN("EN"),
    RU("RU"),
    FR("FR"),
    DE("DE");

    private String value;

     LanguageType(String value) {
        this.value = value;
    }
}
