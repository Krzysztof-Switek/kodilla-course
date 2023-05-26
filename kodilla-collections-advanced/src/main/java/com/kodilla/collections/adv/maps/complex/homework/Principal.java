package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Objects;

public class Principal {
    private final String name;

    public Principal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

