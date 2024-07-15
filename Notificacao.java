

import java.util.Scanner;
import java.util.ArrayList;

public class Notificacao {
    Scanner leitor = Main.getLeitor();
    
    private Entrevista ent; //puxa entrevista para aviso de entrevista
    private DescricaoVaga nvg; 
    private Vaga vg;
    private Candidato cnd; //puxa candidato
    private Candidatura cand;
    private Empresa ugh;
    private StatusCandidatura att;
    private Recrutador rh;
    private Menu mn;
 

    // notificações candidato
    protected void NotificacoesCnd() {
        DescricaoVaga nova = vg.getNovaVaga();
        int voltar;
        
            switch(att.getStatus()){
                    
                case ESTA_INSCRITO:       
            
                System.out.println("Você está a um passo de ser contratado!\n");
                System.out.println("Mantenha-se atento ao agendamento da sua entrevista!");
                System.out.println("1 - Voltar ");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuCandidato();
                    }
                    break;
                    
                case CONTRATADO:
                System.out.println("PARABÉNS, VOCÊ FOI CONTRADO/A!");
                System.out.println("Fique atento as informações da vaga, entre em contato com " + rh.getEmpresa() + " pelo email " + ugh.getEmailCorporativo());
                    System.out.println("1 - Voltar ");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuCandidato();
                    }
                    break;
                    
                case DESCLASSIFICADO:
                System.out.println("Poxa, não foi dessa vez. Mas temos uma vaga para você! " + nova.getTitulo());
                    System.out.println("1 - Voltar ");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuCandidato();
                    }
               break;
                    
                case DESISTENCIA:
                    System.out.println("Hmm... Talvez uma vaga em " + nova.getTitulo() + " seja melhor para você!");
                    System.out.println("1 - Voltar ");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuCandidato();
                    }
                    break;

                default:

                        
                        System.out.println(nova.getEmpresa() + " esta contratando para " + nova.getTitulo() + "\n");
                        System.out.println("Você está a um passo de ser contratado!\n");
                        System.out.println("Boa Sorte! Sua entrevista foi agendada. Cheque o menu de agendamento para mais informações.\n");
                        System.out.println("1 - Voltar ");
                        voltar = leitor.nextInt();
                        if(voltar == 1){
                        mn.MenuCandidato();
                    break;
                        }
                
            }
        }


           
            protected void NotificacoesRh() {
                Candidatura nova = cand.getPretendente();
                int voltar;

            switch(att.getStatus()){
                    
                case ESTA_INSCRITO:

                    System.out.println(nova.getNome() + " acaba de se candidatar para " + nova.getVaga());
                    System.out.println("1 - Voltar ");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuRecrutador();
                    }
                    break;
                    
                case DESISTENCIA:

                        //se o candidato desiste.
                          System.out.println(cnd.getNome() + " infelizmente desistiu da vaga.");
                          System.out.println("Cheque sua lista de candidatos para encontrar o perfeito candidato.");
                          System.out.println("Já considerou " + nova.getNome() + " para a vaga? Temos uma excelente lista de candidatos para você!");

                    System.out.println("1 - Voltar\n2 - Candidaturas\n__");
                    voltar = leitor.nextInt();
                    if(voltar == 1){
                        mn.MenuRecrutador();
            }else{
                        cand.Candidaturas();
            }
                    break;
                    
                default:
                    
                        if(cand.getCandidatura().isEmpty()) {
                            System.out.println("Não há candidatos para a vaga " + nvg.getTitulo() + ".");
                            System.out.println("1 - Voltar\n__");

                        }else{

                            System.out.println(nova.getNome() + " acaba de se inscrever para a vaga ");
                            System.out.println("1 - Voltar\n__");
                            
                            }
                            
                        }
            }
                    
    
    }


    

    
}


