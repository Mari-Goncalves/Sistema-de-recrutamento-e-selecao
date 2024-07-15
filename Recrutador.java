import java.util.ArrayList;
public class Recrutador {
  
  private Empresa ugh;
  String nome;
  int id;
  int senha;
  String cargo;
  String empresa;



  protected Recrutador(String nome, int id, int senha, String cargo, String empresa){
    this.nome = nome;
    this.id = id;
    this.senha = senha;
    this.empresa = empresa;


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

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }


  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }


  @Override
  public String toString() {

    return nome + " " + cargo + " " + empresa + " " + id + " " + senha;
  }



  }

  
}
