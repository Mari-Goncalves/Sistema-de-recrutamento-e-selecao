import java.util.ArrayList;
public class Candidato{

  
  
    int id;
    int senha;
    String nome;
    String email;
    String nivelEscolaridade;
    String objetivos;
    String habilidades;
    String experiencia;
    String cursos;
    

    protected Candidato(int id, int senha, String nome, String email, String nivelEscolaridade, String objetivos, String habilidades, String experiencia, String cursos){
      
      this.id = id;
      this.senha = senha;
      this.nome = nome;
      this.email = email;
      this.nivelEscolaridade = nivelEscolaridade;
      this.objetivos = objetivos;
      this.habilidades = habilidades;
      this.experiencia = experiencia;
      this.cursos = cursos;


    }


  


    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }


    public int getSenha() {
      return senha;
    }

    public void setSenha(int senha) {
      this.senha = senha;
    }

    public void getEmail(String email){
      this.email = email;
    }

    public String getEmail(){
      return email;
    }

    public String getNivelEscolaridade() {
      return nivelEscolaridade;;
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

   public void setHabilidades(String habilidades){
     this.habilidades = habilidades;
   }

    public String getExperiencia() {
      return experiencia;
    }

    public void setExperiencia(String experiencia) {
      this.experiencia = experiencia;
    }

    public String getCursos() {
      return cursos;
    }

    public void setCursos(String cursos) {
      this.cursos = cursos;
    }


    @Override
    public String toString() {

      return id + " " + senha + " " + nome + " " + nivelEscolaridade + " " + objetivos + " " + id + " " + senha;
    }



    }


  }
