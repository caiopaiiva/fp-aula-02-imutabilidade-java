package exercicios;

public record CidadeRecord(String nome) {
    @Override
    public String toString() {
        return nome;
    }
}
