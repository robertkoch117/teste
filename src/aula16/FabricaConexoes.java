package aula16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {
    private String servidor, porta, base, login, senha;
    
    public FabricaConexoes(){
       this.servidor = "localhost";
       this.porta = "3306";
       this.base = "aula16";
       this.login = "root";
       this.senha = "root";
    }
    
    public Connection Conexao() throws ClassNotFoundException, SQLException{
        return (Connection) DriverManager.getConnection("jdbc:mysql://"+getServidor()+":"+getPorta()+"/"+getBase(),getLogin(),getSenha());
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
