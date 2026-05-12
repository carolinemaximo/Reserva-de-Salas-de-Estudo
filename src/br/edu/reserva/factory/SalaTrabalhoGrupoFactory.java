package br.edu.reserva.factory;

import br.edu.reserva.model.Sala;
import br.edu.reserva.model.SalaTrabalhoGrupo;

public class SalaTrabalhoGrupoFactory extends SalaFactory {

    @Override
    public Sala criarSala(String id, String nome, int capacidade) {
        return new SalaTrabalhoGrupo(id, nome, capacidade);
    }
}