package aula16;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Listar {
    public static void main(String[] args)throws ClassNotFoundException, SQLException{
        PessoaDAO operacao = new PessoaDAO();
        ArrayList lista = operacao.listar();
        Iterator indice = lista.iterator();
        Pessoa p = new Pessoa();
        int i=0;
        while(indice.hasNext()){
            System.out.println((Pessoa) lista.get(i++));
            indice.next();
        }
    }
}
