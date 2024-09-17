package com.poo.projetoaplicado.clinicavet;

public enum EnumStatusConsulta {
    AGENDADA("Agendada"),
    FINALIZADA("Finalizada"),
    CANCELADA("Cancelada");

    private final String descricao;

    EnumStatusConsulta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


