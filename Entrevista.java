public class Entrevista {
   
    private String horario;
    
    private String data;
    
    private Candidato candidato;
   
    private Recrutador recrutador;
    
    public Entrevista (Candidato candidato, Recrutador recrutador, String horario, String data){
        this.candidato = candidato;
        this.recrutador = recrutador;
        this.horario = horario;
        this.data = data;
    
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
   
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
 
    public Recrutador getRecrutador() {
        return recrutador;
    }

    public void setRecrutador(Recrutador recrutador) {
        this.recrutador = recrutador;
    }
}
