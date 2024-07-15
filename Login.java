public class Login extends Cadastro{

  private Candidato cnd;
  private Recrutador rh; 
  private Menu mn;

    private int systemId;
    private int systemSenha;

  protected void login(){
    
    System.out.println("__Login__\n");
    System.out.println("ID: ");
    systemId = leitor.nextInt();
    System.out.println("Senha: ");
    systemSenha = leitor.nextInt();
    
    do{
    if(systemId == cnd.getId() && systemSenha == cnd.getSenha()){
      System.out.println("Bem vindo " + cnd.getNome());
      mn.MenuCandidato();
    }else if(systemId == rh.getId() && systemSenha == rh.getSenha()){
      System.out.println("Bem vindo " + rh.getNome());
      mn.MenuRecrutador();
    }else{
      System.out.println("ID ou senha incorreto, tente novamente.");
    }
    }while(systemId != cnd.getId() || systemSenha != cnd.getSenha() || systemId != rh.getSenha() || systemSenha != rh.getSenha());

    

    

    
  }
  
