package aula16;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Inserir {
    
    public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException{
        Pessoa p = new Pessoa();
        p.setNome("Anderson");
        p.setEmail("asantos@unicarioca.edu.br");
        p.setCpf("000.000.000-00");
        p.setTelefone("9999-8888");
        p.setSexo(true);
        Date datanascimento = (Date) new SimpleDateFormat("yyyy-MM--dd").parse("1974-01-01");
        p.setDatanascimento(datanascimento);
     
        PessoaDAO operacao = new PessoaDAO();
        
        int resultado = operacao.inserir(p);
        
        System.out.println(resultado == 1?"INSERIU":"NÃO INSERIU");
    }
    
            
}
