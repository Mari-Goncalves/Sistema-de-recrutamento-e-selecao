import java.util.ArrayList;
import java.util.Scanner;
public class Vaga{
  

    
    ArrayList<Vaga> vaga = new ArrayList<Vaga>();
    
    ArrayList<DescricaoVaga> DescricaoVaga = new ArrayList<DescricaoVaga>();
    
    DescricaoVaga descricaoVaga = new DescricaoVaga("id", "titulo", "descricao", "requisito", "salario");
  
    int id = descricaoVaga.getId();
    String titulo = descricaoVaga.getTitulo();
    String descricao = descricaoVaga.getDescricao();
    String salario = descricaoVaga.getSalario();
    String modalidade = descricaoVaga.getModalidade();
    
    String requisito = descricaoVaga.getRequisito();
    String cargaHoraria = descricaoVaga.getCargaHoraria(); 
    String tipoContratacao = descricaoVaga.getTipoContratacao();
  

    public String getSalario(){
        return salario;
    }
    public String getDescricao(){
      return descricao;
    }
    public String getModalidade(){
      return modalidade;
    }
    public String getTitulo(){
        return titulo;
    }

    
  
    public Vaga(String titulo, String descricao, String salario, String modalidade){
      this.titulo = descricaoVaga.getTitulo();
      this.descricao = descricaoVaga.getDescricao();
      this.salario = descricaoVaga.getSalario();
      this.modalidade = descricaoVaga.getModalidade();
      
    }

    
  

   
  public void displayMenu(){
    Scanner leitor = Main.getLeitor();
    
    int choice = leitor.nextInt();
    System.out.println("1 - Cadastrar vaga\n2 - Ver Vagas");
    if(choice == 1){
      DescricaoVaga.addVaga();
      
      DescricaoVaga vaga = new DescricaoVaga(id, titulo, descricao, requisito, salario, cargaHoraria, tipoContratacao, modalidade);
      
      
    }else{
      DisplayVagas();
    }
  }
    

    public void DisplayVagas(){
      for (Vaga vaga : this.vaga){
        System.out.println(vaga.getTitulo() + vaga.getSalario() + vaga.getModalidade() + vaga.getDescricao());
      }

    
    

  }
}
  