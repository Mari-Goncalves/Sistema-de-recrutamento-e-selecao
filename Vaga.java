//Gerencia tudo a ver com vagas (a lista de vagas, adc vagas, deletar, editar, procura e mostra todas as vagas)
import java.util.ArrayList;
import java.util.Scanner;
public class Vaga{

  Scanner leitor = Main.getLeitor();
  private Recrutador rh;
  private Empresa ugh;
  private Menu mn;
  private Candidatura cand;
 

  



    private ArrayList<DescricaoVaga> Vaga = new ArrayList<DescricaoVaga>();
    


  
      public void addVaga(DescricaoVaga vaga){
        Vaga.add(vaga);
    }

      public void RemoveVaga(DescricaoVaga vaga){
        Vaga.remove(vaga);
      }

  public int getSize(){
    return Vaga.size();    
  }

  public DescricaoVaga getNovaVaga(){
  return Vaga.get(Vaga.size() - 1);
  }


    
      public void getDisplayCDV(){
        displayCDV();
  }
      public void getDeletarVaga(){
        DeletarVaga();
  }
      public void getEditarVaga(){
        EditarVaga();
  }

 

  protected void displayCDV(){
      //CDV = criador de vaga

    Scanner leitor = Main.getLeitor();
    int id = (int)(Math.random() * 1000);
    System.out.println("(" + id + ")");
    String titulo = leitor.nextLine();
    System.out.println("Titulo: ");
    String salario = leitor.nextLine();
    System.out.println("\nSalario: ");
    String descricao = leitor.nextLine();
    System.out.println("\nDescricao: ");
    String requisito = leitor.nextLine();
    System.out.println("\nRequisitos: ");
    String cargaHoraria = leitor.nextLine();
    System.out.println("\nCarga Horaria: ");
    String tipoContratacao = leitor.nextLine();
    System.out.println("\nTipo de Contratacao: ");
    String modalidade = leitor.nextLine();
    System.out.println("\nModalidade: ");
    String empresa = ugh.getRazaoSocial();  
    DescricaoVaga vaga = new DescricaoVaga(id, titulo, descricao, requisito, salario, cargaHoraria, tipoContratacao, modalidade, empresa);

    int choice = leitor.nextInt();
    System.out.println("Confirmar? \n1 - Sim\n2 - Nao");

        if(choice == 1){
        //salva vaga em arquivo txt
        addVaga(vaga);
          Vagas();
    }else{
    System.out.println("Vaga excluída.");
      Vagas();


    }



  }


  protected void EditarVaga(){
    int edit = leitor.nextInt();

    System.out.print("\nID da vaga que deseja alterar: ");
    edit = leitor.nextInt();


      for(DescricaoVaga vaga : Vaga){
      if(vaga.getEmpresa().equals(rh.getEmpresa()) && vaga.getId() == edit){
        System.out.println(vaga);
        System.out.println("1 - Editar Titulo\n2 - Editar Salario\n3 - Editar Descricao\n4 - Editar Requisitos\n5 - Editar Carga Horaria\n6 - Editar Tipo de Contratacao\n7 - Editar Modalidade\n8 - Sair");
        int choice = leitor.nextInt();
        switch (choice){
          case 1:
            System.out.println("Novo Titulo: ");
            String titulo = leitor.nextLine();
            vaga.setTitulo(titulo);
          case 2:
            System.out.println("Novo Salario: ");
            String salario = leitor.nextLine();
            vaga.setSalario(salario);
          case 3:
            System.out.println("Nova Descricao: ");
            String descricao = leitor.nextLine();
            vaga.setDescricao(descricao);
          case 4:
            System.out.println("Novos Requisitos: ");
            String requisito = leitor.nextLine();
            vaga.setRequisito(requisito);
          case 5:
            System.out.println("Nova Carga Horaria: ");
            String cargaHoraria = leitor.nextLine();
            vaga.setCargaHoraria(cargaHoraria);
          case 6:
            System.out.println("Novo Tipo de Contratacao: ");
            String tipoContratacao = leitor.nextLine();
            vaga.setTipoContratacao(tipoContratacao);
          case 7:
            System.out.println("Nova Modalidade: ");
            String modalidade = leitor.nextLine();
            vaga.setModalidade(modalidade);
          case 8:
            mn.MainMenu();
        }
      }else{
        System.out.println("Vaga não encontrada. Tente novamente.");
        mn.MainMenu();
      }

    
      }
      }
 
  

  protected void DeletarVaga(){
    
        for (DescricaoVaga vaga : Vaga){
          if(vaga.getEmpresa().equals(rh.getEmpresa())){
            System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\n");
          }
        
        System.out.println("Digite a vaga que deseja excluir: ");
        String t = leitor.nextLine();
    
        if(t.equals(vaga.getTitulo())){
          System.out.println(this.Vaga);
          System.out.println("Confirmar? \n1 - Sim       2 - Não\n");
          int conf = leitor.nextInt();
          
          switch(conf){
              
            case 1:
            Vaga.remove(vaga);
            System.out.println("Vaga excluída.");
            case 2:
            System.out.println("Retornando ao menu anterior.");
            mn.getDisplayGerenciador(); 
          }
          
        }else{
          System.out.println("Vaga não encontrada.");
          DeletarVaga();

          }
        }
        
          
        }
            
            
      

  
  protected void Vagas(){
    
    Scanner leitor = Main.getLeitor();
    int choice = leitor.nextInt();
    System.out.println("1 - Ver todas as vagas\n2 - Procurar Vagas\n__");
    switch(choice){
      case 1:    
    System.out.println("Vagas disponiveis: " + Vaga.size());
    for (DescricaoVaga vaga : Vaga){
      System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
    }
      System.out.println("Digite a ID da vaga que deseja visualizar: ");
        int show = leitor.nextInt();
        for (DescricaoVaga vaga : Vaga){
          
          if(vaga.getId() == show){
            
            System.out.println(vaga.getId() + " - " + vaga.getTitulo() + "\n$ " + vaga.getSalario() + "    🏃‍♂️ "  + vaga.getModalidade() + "   ⏱︎ " + vaga.getCargaHoraria() + "\n☝ " + vaga.getRequisito() + "    👥 " + vaga.getTipoContratacao() + "\n" + vaga.getDescricao() + "\nPostado por " + vaga.getEmpresa());
            System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
            choice = leitor.nextInt();
            if(choice == 1){
              cand.Candidatacao();
              System.out.println();
            }else{
              Vagas();
            }

          }else{
            System.out.println("Nenhuma vaga encontrada.");
            Search();
          }
        }
        
          
        case 2:
          Search();
    }
  }
    

  public void Search(){
    Scanner leitor = Main.getLeitor();
    int choice = leitor.nextInt();
    System.out.print("Procurar por vaga por...\n1 - Titulo\n2 - Salario\n3 - Modalidade\n__");
    switch(choice){
      case 1:
      String porNome = leitor.nextLine();
      System.out.println("Titulo: ");
      for (DescricaoVaga vaga : Vaga){
        if(vaga.getTitulo().equals(porNome)){
          System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
          System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
          choice = leitor.nextInt();
          if(choice == 1){
            //metodo para enviar curriculo
          }else{
            Vagas();
          }


          
        }else{
          System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
          Search();
        }
      }
      case 2:
      String valor = leitor.nextLine();
      System.out.println("Remuneração desejada: ");
        for (DescricaoVaga vaga : Vaga){
          if(vaga.getSalario().equals(valor)){
            System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
            System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
            choice = leitor.nextInt();
            if(choice == 1){
              //metodo para enviar curriculo
            }else{
              Vagas();
            }
 
          }else{
            System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
            Search();
          }
        }
          case 3:
          String mod = leitor.nextLine();
          System.out.println("Modalidade: ");
          for (DescricaoVaga vaga : Vaga){
            if(vaga.getSalario().equals(mod)){
              System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
              System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
              choice = leitor.nextInt();
              if(choice == 1){
                //metodo para enviar curriculo
              }else{
                Vagas();
              }
            }else{
              System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
              Search();
            }
          
        }
       
  }    
    
 
}
  }
