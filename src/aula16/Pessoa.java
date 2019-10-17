/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author 2017101788
 */
public class Pessoa {
        private String nome,email,cpf,telefone;
        private boolean sexo;
        private Date datanascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isSexo() {
        return sexo;
    }
    
    public String getSexo(){
        return sexo?"M":"F";
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
    
    public String getDatanascimentoString(){
        String data = new SimpleDateFormat("dd/MM/yyyy").format(this.datanascimento);
      
        return data;
    }
    
    @Override
    public String toString(){
        String PessoaString = "Nome: " + this.nome;
        PessoaString += "\n";
        PessoaString += "CPF: " + this.cpf;
        PessoaString += "\n";
        PessoaString += "Telefone: " + this.telefone;
        PessoaString += "\n";
        PessoaString += "Sexo: " + this.getSexo();
        PessoaString += "\n";
        PessoaString += "Data de Nascimento: " + this.getDatanascimentoString();
        PessoaString += "\n";
        PessoaString += "Email: " + this.email;
        PessoaString += "\n";
        
        return PessoaString;

    }
    
    
        
        
}
