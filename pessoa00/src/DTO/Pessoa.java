package DTO;

public class Pessoa {

    private String Nome;
    private String Sobrenome;
    private String Telefone;
    private String CPF;
    private String RG;
    private int Idade;
    private String email;
    private String cep;
    
    public Pessoa (String nome, String Sobrenome, String Telefone, String CPF, String RG, int Idade, String email, String CEP) {
        this.Nome=nome;
        this.Sobrenome=Sobrenome;
        this.Telefone=Telefone;
        this.CPF=CPF;
        this.RG=RG;
        this.Idade=Idade;
        this.email=email;
        this.cep=cep;
        
    }
}

