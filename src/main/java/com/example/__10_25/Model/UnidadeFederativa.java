package com.example.__10_25.Model;

public enum UnidadeFederativa {
    BAHIA("BA"),
    SAO_PAULO("SP"),
    RIO_DE_JANEIRO("RJ");

    private String none;

    UnidadeFederativa(String none) {
        this.none = none;
    }
    public String getNone() {
        return none;
    }
}
