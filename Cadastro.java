import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro extends Menu{
  
private ArrayList<Candidato> curriculo = new ArrayList<Candidato>();
private ArrayList<Empresa> comercio = new ArrayList<Empresa>();
private ArrayList<Recrutador> recrutador = new ArrayList<Recrutador>();
Scanner leitor = Main.getLeitor();


  //adiciona e remove empresa a lista de array list
  public void addEmpresa(Empresa empresa){
      comercio.add(empresa);
  }

  public void removeEmpresa(Empresa empresa){
      comercio.remove(empresa);
  }

  // adiciona e remove candidato a lista de array list

  public void addCandidato(Candidato candidato){
    curriculo.add(candidato);
  }

  public void RemoveCandidato(Candidato candidato){
    curriculo.remove(candidato);
  }

  //adiciona e remove recrutador a lista de array list

  public void addRecrutador(Recrutador recrutador){

    this.recrutador.add(recrutador);
    
  }

  public void removerRecrutador(Recrutador recrutador){
    this.recrutador.remove(recrutador);
  }

  // a lista de array list, como na vaga, é feita no local aonde as informações serão editadas, acrescentadas etc. Como esta classe acrescenta um cadastro (um metodo geral para adicionar recrutadores, candidatos e empresas nas listas, ja que nao existe menus para isso no codigo atual)
  
  boolean cadastrar = false;
  // cadastroo de candidato, pega as informações inseridas por input do usuario e adiciona nas variaveis definidas no construtor na classe Candidadto. Feito em formato de Menu para poder ser inserido na estrutura do menu de principal.
  protected void CadastroCND(){

  
  do{
  System.out.println("CADASTRO CANDIDATO\n");
  int id = (int)(Math.random() * 1000);
  System.out.println("Nome: ");
  String nome = leitor.nextLine();
  System.out.println("Email: ");
  String email = leitor.nextLine();
  System.out.println("Senha: ");
  int senha = leitor.nextInt();
  System.out.println("Nivel de escolaridade: ");
  String nivelEscolaridade = leitor.nextLine();
  System.out.println("Objetivos: ");
  String objetivos = leitor.nextLine();
  System.out.println("Habilidades: ");
  String habilidades = leitor.nextLine();
  System.out.println("Experiencia: ");
  String experiencia = leitor.nextLine();
  System.out.println("Cursos: ");
  String cursos = leitor.nextLine();
  Candidato curriculo = new Candidato(id, senha, nome, email, nivelEscolaridade, objetivos, habilidades, experiencia, cursos);
  System.out.println(curriculo);
  System.out.println("\nDeseja Salvar?\n1 - Sim\n2 - Não\n3 - Voltar");
    int salvar = leitor.nextInt();
    if(salvar == 1){
      //metodo salvar
      //adiciona candidato a lista
      addCandidato(curriculo);
      cadastrar = true;
      // termina o looping e leva ao menu do candidato abaixo      
      MenuCandidato();
    }else if(salvar == 2){
      cadastrar = true;
      //repete o looping
    }else{
      MainMenu();
    } 

  } while(cadastrar = false);
    
}
  
  
  // cadastroo de recrutador/empresa, pega as informações inseridas por input do usuario e adiciona nas variaveis definidas no construtor na classe Recrutador E Empresa. Feito em formato de Menu para poder ser inserido na estrutura do menu de principal.
  protected void CadastroRH(){
  
   // do while para repetir o cadastro enquanto o usuario são salvar o perfil.
    do{

  //cadastro empresa primeiro  
  System.out.println("\nCADASTRO EMPRESA\n");
  System.out.println("Razão Social: ");
  String razaoSocial = leitor.nextLine();
  System.out.println("CNPJ: ");
  String cnpj = leitor.nextLine();
  System.out.println("Endereço: ");
  String endereco = leitor.nextLine();
  System.out.println("Email Corporativo: ");
  String emailCorporativo = leitor.nextLine();
  Empresa comercio = new Empresa(razaoSocial, cnpj, endereco, emailCorporativo);
  System.out.println(comercio);

      // imprimi o comercio com suas informações para o usuario ver se esta tudo certo
//cadastro de recrutador por ultimo
  System.out.println("CADASTRO RECRUTADOR\n");
  int id = (int)(Math.random() * 1000);
  System.out.println("Nome: ");
  String nome = leitor.nextLine();
  System.out.println("Senha: ");
  int senha = leitor.nextInt();
  System.out.println("Cargo: ");
  String cargo = leitor.nextLine();
  String empresa = comercio.getRazaoSocial();
      //pega o nome da empresa acima.
  Recrutador recrutador = new Recrutador(nome, id, senha, cargo, empresa);
  System.out.println(recrutador);
      //imprimi recrutador para checagem
  System.out.println("\nDeseja Salvar?\n1 - Sim\n2 - Não\n3 - Voltar");
  int choice = leitor.nextInt();
      if(choice == 1){
        //metodo salvar
        //adiciona recrutador a lista de recrutador e empresa a lista de empresa
        addEmpresa(comercio);
        addRecrutador(recrutador);
        cadastrar = true;
        // termina o looping para partir pro menu de recrutador
        MenuRecrutador();
                
      }else if(choice == 2){
        //repete o looping
        cadastrar = false;
      }else{
        //volta para o menu inicial (que pergunta sobre cadastro e login)
        MainMenu();
      }
    
  }while (cadastrar = false);
  }


      
}
