
import java.util.ArrayList;

public class Notificacao {
    private Entrevista ent; //puxa entrevista para aviso de entrevista
    private DescricaoVaga nvg; 
    private Candidato cnd; //puxa candidato
    private Empresa ugh;
    private StatusCandidatura att;
    private Recrutador rec;
    private Vaga vg; // puxa vagas
    private Menu mn;


    // Method to add notification
    
       
        

    //TROCAR METODO DE ADC VAGAS E METODO DE PROCURA DE VAGA DE LUGAR
    // ADICIONAR RETURN PARA MENUS APROPRIADOS ABAIXO DAS NOTIFICACOES
    // NECESSITA DE METODOS PARA DIFERENCIAR RECRUTADOR DO CANDIDATO
    //
       



    // Method to display all notifications
    protected void displayNotificacoes() {
        
        
        
            switch(att.getStatus){
                    
                case att.ESTA_INSCRITO():       
            
                System.out.println("Você está a um passo de ser contratado!\n");
                System.out.println("Mantenha-se atento ao agendamento da sua entrevista!");
                System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
               
                case att.APTO_ENTREVISTA():
                //if(recrutador){
                System.out.print("");
                //else{
                System.out.println("");
                    
                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
                    
                case att.CONTRATADO():
                System.out.println("PARABÉNS, VOCÊ FOI CONTRADO/A!");
                System.out.println("Fique atento as informações da vaga, entre em contato com " + rh.empresa + " pelo email " + rh.email);

                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
                    
                case att.DESCLASSIFICADO():
                System.out.println("Poxa, não foi dessa vez. Mas temos uma vaga para você! " + nvg.get(Vaga.size() -1));
                    
                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
                case att.PRIMEIRA_ENTREVISTA():
                System.out.println("Boa sorte! Sua entrevista foi marcada para " + ent.getData() + "\n"");
                System.out.println("Aqui vão algumas dicas parra garantir a vaga!"); 

                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
                    
                case att.ENTREVISTA_TECNICA():
                System.out.println("O que é uma entrevista técnica? Fique atento aos minimos detalhes para não passar vergonha na hora H");

                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }

                case att.ESTA_INSCRITO():

                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }

                case att.DESISTENCIA():
                    
                  if(recrutador){
                      System.out.println(cnd.getCandidato() + " infelizmente desistiu da vaga.");
                      System.out.println("Cheque sua lista de candidatos para encontrar o perfeito candidato.");
                      System.out.println("Já considerou " + cnd.get(Candidatos.size() -1) + " para a vaga? Temos uma excelente lista de candidatos para você!");
                  }else{
                    System.out.println("Hmm... Talvez uma vaga em " + nvg.get(Vaga.size() -1) + " seja melhor para você!");   
                  }

                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }

                    
                case att.NAO_APTO_ENTREVISTA():

                    if(recrutador){
                        System.out.println("Para reagendar a entrevista, acesse nosso painel de agendamento.");
                          }else{
                        System.out.println("Entrevista não comparecida. Entre em contato com " + rh.empresa + " pelo email " + rh.email);
                          }
                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }

                case att.getStatus() == null:

                    if(recrutador){
                        
                        if(cnd.CandidatosList.isEmpty() -1) == null)){
                            System.out.println("Não há candidatos para a vaga " + rh.getVaga() + ".");
                            
                        }else{
                        System.out.println("Você tem " + Candidatos.size() + "\n");
                        System.out.println("Wow! Parece que " + cnd.get(Candidatos.size()-1) + " se interessou na vaga!");
                        
                        for (Candidato cnd.getCandidato() : cnd.getCandidato()){
                        System.out.println(cnd.get(Candidatos.size()-1) + " acaba de se inscrever para a vaga " + cnd.getVaga());
                    }
                          }else{
                        
                        System.out.println(ugh.getEmpresa() + " esta contratando para " + vg.getTitulo() + "\n");
                        System.out.println("Você está a um passo de ser contratado!\n");
                        System.out.println("Boa Sorte! Sua entrevista foi marcada para " + ent.getData() + "\n");
                        
                          }
                    System.out.println("1 - Voltar ");
                    int voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.displayMainMenu();
                    }
                    
                    

                
            }
        }
    }


 

    private void Painel(Entrevista ent){
        this.ent = ent;
    }
    private void Painel(DescricaoVaga nvg){
        this.nvg = nvg;
    }
    private void Painel(Candidato cnd){
        this.cnd = cnd;
    }
    private void Painel(Empresa ugh){
        this.ugh = ugh;
    }
    private void Painel(StatusCandidatura att){
        this.att = att;
    }
    

    
}

 //dished damned and done, bitch
