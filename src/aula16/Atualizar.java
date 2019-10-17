package aula16;

import java.sql.SQLException;

public class Atualizar {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Pessoa p = new Pessoa();
        p.setNome("Anderson");
        
        String telefone = "8888-9999";
        PessoaDAO operacao = new PessoaDAO();
        int resultado = operacao.atualizarTelefone(p,telefone);
        
        System.out.println(resultado>0?"Atualizou":"Não Atualizou");
    }
}
