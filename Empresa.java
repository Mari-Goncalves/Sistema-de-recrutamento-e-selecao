public class Empresa {
    
    
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private String emailCorporativo;
    


    protected Empresa(String razaoSocial, String cnpj, String endereco, String emailCorporativo){

      this.razaoSocial = razaoSocial;
      this.cnpj = cnpj;
      this.endereco = endereco;
      this.emailCorporativo = emailCorporativo;

    }

    

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }


     @Override
        public String toString() {

          return razaoSocial + " " + cnpj + " " + endereco + " " + emailCorporativo;
        }
    
}
