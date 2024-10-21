import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        final var cidade1 = new Cidade("Pium");
        final var cidade2 = new CidadeRecord("Pugmil");

        final var pessoa = new PessoaRecordShallow("Julio", cidade1);
        System.out.println(pessoa);// nome: Julio, Cidade: Pium
        cidade1.setNome("Palmas"); // alterando o nome da cidade provando que a classe Pessoa... é superficialmente imutavel Shallow Immutability
        System.out.println(pessoa);//nome: Julio, Cidade: Palmas

        final var pessoaImutavel = new PessoaRecord("Manoel", cidade2);
        System.out.println("\n"+pessoaImutavel);//nome: Manoel, Cidade: Pugmil
        System.out.println("PessoaRecord profundamente (totalmente) imutável (deep imutability), pois o Record: CidadeRecord não possui metodos para alteração de valor da variavel nome");
    }
}
