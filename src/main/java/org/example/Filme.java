package org.example;

public class Filme {

    private String name;
    private String genero;

    public Filme(String name, String genero) {
        this.name = name;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }
}
