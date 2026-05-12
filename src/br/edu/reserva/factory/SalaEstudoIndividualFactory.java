package br.edu.reserva.factory;

import br.edu.reserva.model.Sala;
import br.edu.reserva.model.SalaEstudoIndividual;

public class SalaEstudoIndividualFactory extends SalaFactory {

    @Override
    public Sala criarSala(String id, String nome, int capacidade) {
        return new SalaEstudoIndividual(id, nome);
    }
}