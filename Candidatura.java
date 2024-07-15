import java.util.ArrayList;
public class Candidatura{
  protected ArrayList<Candidatura> pretendente = new ArrayList<Candidatura>();
  private Candidato cnd;
  private DescricaoVaga dvg;
  private StatusCandidatura att;

  private int id;
  private String nome;
  private String email;
  private String curriculo;
  private String vaga;

  protected Candidatura(int id, String nome, String email, String curriculo, String vaga){

    this.id = cnd.getId();
    this.nome = cnd.getNome();
    this.email = cnd.getEmail();
    this.curriculo = cnd.getExperiencia() + " " + cnd.getCursos() + " " + cnd.getHabilidades() + " " + cnd.getNivelEscolaridade() + " " + cnd.getObjetivos();
    this.vaga = dvg.getTitulo();
    
  }

  public void addCandidatura(Candidatura candidatura){
      pretendente.add(candidatura);
  }

  public String getCandidatura(){
    return vaga + "\n( " + id + " )" + " - " + nome + "\n contato: " + email + "\n" + curriculo;
  }


  protected void Candidaturas(){
    for(Candidatura candidatura : pretendente){
      System.out.println(candidatura.getCandidatura());
    }
  }

  public Candidatura getPretendente() {
          if (pretendente.isEmpty()) {
              return null; 
          } else {
              return pretendente.get(pretendente.size() - 1);
          }
      }


public void Candidatacao(){
  //printa o curriculo, pergunta se quer editar algo, leva pro menu de edicao
  //se aceita, adiciona uma candidatura como abaixo
  int id = cnd.getId();
  String nome = cnd.getNome();
  String email = cnd.getEmail();
  String curriculo = cnd.getExperiencia() + " " + cnd.getCursos() + " " + cnd.getHabilidades() + " " + cnd.getNivelEscolaridade() + " " + cnd.getObjetivos();
  String vaga = dvg.getTitulo();
  Candidatura candidatura = new Candidatura(id, nome, email, curriculo, vaga);
  addCandidatura(candidatura);
  System.out.println("Inscrito para a " + this.vaga);
    att.ESTA_INSCRITO();
  
  
  
}



public String getNome(){
  return nome;
}
public String getVaga(){
  return vaga;
}

  
  
@Override
  public String toString() {

    return id + " " + nome + " " + vaga + " " + email + " " + curriculo;
      }
  
}
