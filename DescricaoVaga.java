public class DescricaoVaga extends Vaga{
    public int id;
    public String titulo;
    public String descricao;
    public String requisito;
    public String salario;
    public String cargaHoraria;
    public String tipoContratacao;
    public String modalidade;
    public String empresa;
    private Empresa ugh;
    
    
    
    public DescricaoVaga(int id, String titulo, String descricao, String requisito, String salario, String cargaHoraria, String tipoContratacao, String modalidade, String empresa){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisito = requisito;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.tipoContratacao = tipoContratacao;
        this.modalidade = modalidade;
        this.empresa = ugh.getRazaoSocial();

    }
    
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(String tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    @Override
public String toString() {
       
        return titulo + " " + salario + " " + modalidade + " " + cargaHoraria + tipoContratacao + modalidade + " " + empresa; 
}
    
 

}
