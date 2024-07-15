import java.util.ArrayList;
import java.util.List;

public class Recrutador {
    // Atributos privados da classe Recrutador
    private String cargo; // Cargo do recrutador
    private String endereco; // Endereço do recrutador
    private String nome; // Nome do recrutador

    // Lista de candidatos para armazenar os currículos
    private List<Curriculo> candidatos;

    // Construtor da classe Recrutador
    public Recrutador(String cargo, String endereco, String nome) {
        this.cargo = cargo;
        this.endereco = endereco;
        this.nome = nome;
        this.candidatos = new ArrayList<>();
    }

    // Método para selecionar um candidato
    public void selecionaCandidato(Curriculo candidato) {
        candidato.setStatusCandidatouse(true);
        candidatos.add(candidato);
        System.out.println("Candidato selecionado com sucesso!");
    }

    // Método para excluir um candidato
    public void excluiCandidato(Curriculo candidato) {
        if (candidato.isStatusCandidatouse() && candidatos.remove(candidato)) {
            System.out.println("Candidato excluído com sucesso!");
        } else {
            System.out.println("Usuário não pode ser removido ou não existe");
        }
    }

    // Método para listar candidatos
    public void listarCandidatosStatusContratado() {
        System.out.println("Candidatos: ");
        for (Curriculo candidato : candidatos) {
            if (candidato.isStatusCandidatouse()) {
                System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Endereço: " + endereco);
            }
        }
    }

    // Getters e setters (opcionais)
    // Permitem acessar e modificar os atributos privados de forma controlada
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}
