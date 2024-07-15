public class Curriculo {
    private String nivelEscolaridade; 
    private String objetivos; 
    private String habilidades; 
    private String experiencia; 
    private String cursos; 
    private boolean statusCandidatouse; 

    // Construtor da classe Curriculo
    // Inicializa os atributos com os valores fornecidos e define o status como falso
    public Curriculo(String nivelEscolaridade, String objetivos, String habilidades, 
                     String experiencia, String cursos) {
        this.nivelEscolaridade = nivelEscolaridade;
        this.objetivos = objetivos;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.cursos = cursos;
        this.statusCandidatouse = false; // Inicialmente, o status é falso
    }

    // Método para editar o currículo enquanto o status é "Candidatouse"
    // Só permite a edição se o statusCandidatouse for verdadeiro
    public void editarEnquantoStatusCandidatouse(String novoNivelEscolaridade, String novosObjetivos,
                                                 String novasHabilidades, String novaExperiencia, String novosCursos) {
        if (statusCandidatouse) {
            this.nivelEscolaridade = novoNivelEscolaridade;
            this.objetivos = novosObjetivos;
            this.habilidades = novasHabilidades;
            this.experiencia = novaExperiencia;
            this.cursos = novosCursos;
            System.out.println("Currículo editado com sucesso!");
        } else {
            System.out.println("Currículo não pode ser editado, pois o status não é 'Candidatouse'.");
        }
    }

    // Método para definir o status como "Candidatouse"
    // Este método pode ser chamado para alterar o status do currículo
    public void setStatusCandidatouse(boolean status) {
        this.statusCandidatouse = status;
    }

    // Getters e setters
    // Acessar e modificar os atributos por meio deles
    public String getNivelEscolaridade() { return nivelEscolaridade; }
    public void setNivelEscolaridade(String nivelEscolaridade) { this.nivelEscolaridade = nivelEscolaridade; }

    public String getObjetivos() { return objetivos; }
    public void setObjetivos(String objetivos) { this.objetivos = objetivos; }

    public String getHabilidades() { return habilidades; }
    public void setHabilidades(String habilidades) { this.habilidades = habilidades; }

    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String experiencia) { this.experiencia = experiencia; }

    public String getCursos() { return cursos; }
    public void setCursos(String cursos) { this.cursos = cursos; }

    public boolean isStatusCandidatouse() { return statusCandidatouse; }
}
