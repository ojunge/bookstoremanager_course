package com.mobtag.bookstoremanager.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Adronilson Junge
 */
@Getter
@AllArgsConstructor
public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private String description;
}
