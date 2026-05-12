package br.edu.reserva.model;

public abstract class Sala {

    private final String id;
    private final String nome;
    private final int capacidade;

    protected Sala(String id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getId()         { return id; }
    public String getNome()       { return nome; }
    public int    getCapacidade() { return capacidade; }

    public abstract String getTipo();
    public abstract String getDescricao();

    @Override
    public String toString() {
        return String.format("[%s] %s — %s (cap.: %d)", id, nome, getTipo(), capacidade);
    }
}