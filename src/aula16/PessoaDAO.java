
package aula16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
    
    Connection banco;
    
    public PessoaDAO() throws ClassNotFoundException, SQLException {
        FabricaConexoes fabrica = new FabricaConexoes ();
        banco = fabrica.Conexao();
    }
    
    @Override
    @SuppressWarnings("FinalizeDeclaration")
    protected void finalize() throws SQLException, Throwable {
        try {
            banco.close();
        } finally {
            super.finalize();
        }
    }
    
    public int inserir(Pessoa p) throws ClassNotFoundException, SQLException{
        PreparedStatement stmt = banco.prepareStatement("INSERT INTO pessoa(nome, )"
        +"email, cpf, telefone, sexo, datanascimento)VALUES(?,?,?,?,?,?)");
        
        java.util.Date data = p.getDatanascimento();
        java.sql.Date databanco = new java.sql.Date(data.getTime());
        
        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getEmail());
        stmt.setString(3, p.getCpf());
        stmt.setString(4, p.getTelefone());
        stmt.setBoolean(5,p.isSexo());
        stmt.setDate(6,databanco);
        return stmt.executeUpdate();
    }
    
    public int apagarPeloNome(Pessoa p) throws SQLException {
        PreparedStatement stmt = banco.prepareStatement("DELETE FROM pessoa WHERE nome LIKE ?");
        stmt.setString(1, "%"+p.getNome()+"%");
        return stmt.executeUpdate();
    }
    
    public int atualizarTelefone(Pessoa p, String telefone) throws SQLException {
        PreparedStatement stmt = banco.prepareStatement("UPDATE pessoa SET telefone=? WHERE nome LIKE ?");
        stmt.setString(1, telefone);
        stmt.setString(2, "%"+p.getNome()+"%");
        return stmt.executeUpdate();
    }
    
    public ArrayList listar() throws SQLException{
        PreparedStatement stmt = banco.prepareStatement("SELECT * FROM pessoa");
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        
        ResultSet resultado = stmt.executeQuery();
        Pessoa p;
        while(resultado.next()){
            p = new Pessoa();
            p.setNome(resultado.getString("nome"));
            p.setDatanascimento(resultado.getDate("datanascimento"));
            p.setCpf(resultado.getString("cpf"));
            p.setEmail(resultado.getString("email"));
            p.setSexo(resultado.getBoolean("sexo"));
            p.setTelefone(resultado.getString("telefone"));
            lista.add(p);
        }
        return lista;
    }
}
