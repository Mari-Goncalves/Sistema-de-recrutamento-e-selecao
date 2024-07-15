public class StatusCandidatura{
    
protected STTC status;
    
enum STTC{
    ESTA_INSCRITO,
    DESISTENCIA,
    DESCLASSIFICADO,
    CONTRATADO
}

    public STTC getStatus() {
        return status;
    }

    

    public void setStatus(STTC status) {
        this.status = status;
    }

    
    
    public boolean ESTA_INSCRITO() {
        STTC status = STTC.ESTA_INSCRITO;
            return true;
        }
       


    public boolean DESISTENCIA() {
    STTC status = STTC.DESISTENCIA;
        return true;
    }
    



public boolean DESCLASSIFICADO() {
    STTC status = STTC.DESCLASSIFICADO;
        return true;
    }
    


public boolean CONTRATADO() {
    STTC status = STTC.CONTRATADO;
        return true;
    }
    
    
}
