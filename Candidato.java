import java.util.Scanner;

public class Candidato {
    private String endereco;
    private String cpf;
    Curriculo curriculoCandidato = new Curriculo();

    Scanner sc = new Scanner(System.in);
    boolean isCurriculoCriado = false;
    int opcaoMenuCandidato;
    String atualizarExperiencia;

    // Método construtor - 1º método chamado após a classe ser intanciada.
    public Candidato() {
        System.out.print("Olá candidato(a)! Você deseja: \n");
        System.out.println(" ");
        ExibirMenuCandidato();
    }

    public void ExibirOpcoesMenuCandidato() {
        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        System.out.print("1-Criar currículo\n");
        System.out.print("2-Visualiar currículo\n");
        System.out.print("3-Atualizar currículo\n");
        System.out.print("4-Ver vagas disponiveis\n");
        System.out.print("5-Listar candidaturas\n");

        System.out.println(" ");
    }

    public void ValidarOpcaoMenuCandidato() {
        System.out.print("Escolha uma opção: ");
        opcaoMenuCandidato = sc.nextInt();

        System.out.println(" ");
        System.out.println("--------------------------------------------------");

        switch (opcaoMenuCandidato) {
            case 1:
                if (!isCurriculoCriado) {
                    CriarCurriculo();
                } else {
                    System.out.print("Seu currículo já foi criado. \n");
                    ExibirMenuCandidato();
                }
                break;
            case 2:
                VisualizarCurriculo();
                break;
            case 3:
                AtualizarCurriculo();
                break;
            case 4:
                ListarVagasDisponiveis();
                break;
            case 5:
                ListarCandidaturas();
                break;
            default:
                System.out.print("Valor inválido! Tente novamente. \n");
                ExibirMenuCandidato();
                break;
        }
    }

    public void ExibirMenuCandidato() {
        ExibirOpcoesMenuCandidato();
        ValidarOpcaoMenuCandidato();
    }

    public void CriarCurriculo() {
        System.out.print("Opção 1 | Criar currículo\n");
        curriculoCandidato.CriarCurriculo();
        isCurriculoCriado = true;
        ExibirMenuCandidato();
    }

    public void VisualizarCurriculo() {
        if (isCurriculoCriado) {
            System.out.print("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.VerResultadoCurriculo();
        } else {
            System.out.print("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();
    }

    public void AtualizarCurriculo() {
        if (isCurriculoCriado) {
            System.out.print("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.AtualizarCurriculo();

        } else {
            System.out.print("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();

    }

    public void ListarVagasDisponiveis() {
        System.out.print("ListarVagasDisponiveis... \n");
        ExibirMenuCandidato();
    }

    public void ListarCandidaturas() {
        System.out.print("ListarCandidaturas... \n");
        ExibirMenuCandidato();
    }
}
