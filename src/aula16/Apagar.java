/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import java.sql.SQLException;

/**
 *
 * @author 2017101788
 */
public class Apagar {
    public static void main (String[] args) throws ClassNotFoundException, SQLException{
      Pessoa p = new Pessoa();
      p.setNome("Anderson");
      PessoaDAO operacao = new PessoaDAO();
      int resultado = operacao.apagarPeloNome(p);
      System.out.println(resultado>0?"APAGOU":"NÃO APAGOU");
    }
    
}
