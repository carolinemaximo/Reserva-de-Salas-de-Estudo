package br.edu.reserva.factory;

import br.edu.reserva.model.Sala;
import br.edu.reserva.model.SalaLaboratorio;

public class SalaLaboratorioFactory extends SalaFactory {

    private final String equipamentos;

    public SalaLaboratorioFactory(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public Sala criarSala(String id, String nome, int capacidade) {
        return new SalaLaboratorio(id, nome, capacidade, equipamentos);
    }
}