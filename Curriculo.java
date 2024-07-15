import java.util.Scanner;

public class Curriculo {
    private String formacao;
    private String nivelEscolaridade;
    private String objetivos;
    private String habilidades;
    private String experiencias;
    private String nome;

  Scanner sc = new Scanner(System.in);

  public void CriarCurriculo() {
    System.out.println("--------------------------------------------------");

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.println(" ");

    System.out.print("Formação: ");
    String formacaoCandidato = sc.nextLine();

    System.out.println(" ");

    System.out.print("Nível de escolaridade: ");
    String nivelEscolaridadeCandidato = sc.nextLine();

    System.out.println(" ");

    System.out.print("Objetivos: ");
    String objetivosCandidato = sc.nextLine();

    System.out.println(" ");

    System.out.print("Habilidades: ");
    String habilidadesCandidato = sc.nextLine();

    System.out.println(" ");

    System.out.print("Experiências: ");
    String experienciasCandidato = sc.nextLine();

    System.out.println(" ");

    System.out.print("Curriculo criado com sucesso! \n");
    System.out.println("--------------------------------------------------");

    this.formacao = formacaoCandidato;
    this.nivelEscolaridade = nivelEscolaridadeCandidato;
    this.objetivos = objetivosCandidato;
    this.habilidades = habilidadesCandidato;
    this.experiencias = experienciasCandidato;
    this.nome = nome;
  }

  public void VerResultadoCurriculo() {
    System.out.println("--------------------------------------------------");

    System.out.printf("Nome: %s \n", nome);
    System.out.println(" ");

    System.out.printf("Formação: %s \n", formacao);
    System.out.println(" ");

    System.out.printf("Nível de escolaridade: %s \n", nivelEscolaridade);
    System.out.println(" ");

    System.out.printf("Objetivos: %s \n", objetivos);
    System.out.println(" ");

    System.out.printf("Habilidades: %s \n", habilidades);
    System.out.println(" ");

    System.out.printf("Experiências: %s \n", experiencias);
    System.out.println(" ");

    System.out.println("--------------------------------------------------");
  }

  public void AtualizarCurriculo() {
    System.out.println("--------------------------------------------------");

    System.out.print("Nome: ");
    String nome = sc.nextLine();
    setNome(nome);

    System.out.println(" ");

    System.out.print("Formação: ");
    String formacaoCandidato = sc.nextLine();
    setFormacao(formacaoCandidato);

    System.out.println(" ");

    System.out.print("Nível de escolaridade: ");
    String nivelEscolaridadeCandidato = sc.nextLine();
    setNivelEscolaridade(nivelEscolaridadeCandidato);

    System.out.println(" ");

    System.out.print("Objetivos: ");
    String objetivosCandidato = sc.nextLine();
    setObjetivos(objetivosCandidato);

    System.out.println(" ");

    System.out.print("Habilidades: ");
    String habilidadesCandidato = sc.nextLine();
    setHabilidades(habilidadesCandidato);

    System.out.println(" ");

    System.out.print("Experiências: ");
    String experienciasCandidato = sc.nextLine();
    setExperiencias(experienciasCandidato);

    System.out.println(" ");

    System.out.print("Curriculo atualizado com sucesso! \n");
    System.out.println("--------------------------------------------------");

    this.formacao = formacaoCandidato;
    this.nivelEscolaridade = nivelEscolaridadeCandidato;
    this.objetivos = objetivosCandidato;
    this.habilidades = habilidadesCandidato;
    this.experiencias = experienciasCandidato;
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFormacao() {
    return formacao;
  }

  public void setFormacao(String formacao) {
    this.formacao = formacao;
  }

  public String getNivelEscolaridade() {
    return nivelEscolaridade;
  }

  public void setNivelEscolaridade(String nivelEscolaridade) {
    this.nivelEscolaridade = nivelEscolaridade;
  }

  public String getObjetivos() {
    return objetivos;
  }

  public void setObjetivos(String objetivos) {
    this.objetivos = objetivos;
  }

  public String getHabilidades() {
    return habilidades;
  }

  public void setHabilidades(String habilidades) {
    this.habilidades = habilidades;
  }

  public String getExperiencias() {
    return experiencias;
  }

  public void setExperiencias(String experiencias) {
    this.experiencias = experiencias;
  }
}
