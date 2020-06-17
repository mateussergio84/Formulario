/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mateus
 */
public class Dados {
    Connection con;
    
    public boolean conecta(String local, String banco, String usuario, String senha) {
        boolean retorno = false;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + local + "/" + banco + "?useTimezone=true&serverTimezone=UTC",usuario,senha);
           retorno = true;
        } catch (SQLException e) {
            System.err.println("Erro de conexão:\n" + e);
        }
        return retorno;
    }
    
        public ResultSet consulta(String consulta){
        ResultSet rs = null;
        try{
            PreparedStatement stmt = (PreparedStatement)
                    this.con.prepareStatement(consulta);
            rs = stmt.executeQuery();
        }catch(SQLException e){
            System.err.println("Erro CONSULTA: "+e);
        }
        return rs;
    }
        
        /*public boolean insere(String tabela, String nome,String endereco,String bairro,String cidade,String estado,String cep, String tel,String email, String presenca_web)
   {
       boolean retorno = false;
       try {
          
           PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " +tabela+ " (nome,cep,endereco,bairro,estado,cidade,tel,email,presenca_web) values ('" + nome + "','" +cep+ "','" +endereco+ "','" +bairro+ "','" +estado+"','" +cidade+ "','" +tel+ "','" +email+"','"+presenca_web+"');");//+ modelo +"',"+ano+");");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro INSERT: " + ex);
       }
       return retorno;
   }*/
         
   public boolean insere(String tabela, String nome,String endereco,String bairro,String cidade,String estado,String cep, String tel,String email, String presenca_web)
   {
       boolean retorno = false;
           if(!nome.isEmpty() && !endereco.isEmpty() && !bairro.isEmpty() && !cidade.isEmpty() && !estado.isEmpty() && !cep.isEmpty() && !email.isEmpty()) {
       try {
           String sql = "Insert into pessoas(nome,cep,endereco,bairro,estado,cidade,tel,email,presenca_web) values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, cep);
            stmt.setString(3, endereco);
            stmt.setString(4, bairro);
            stmt.setString(5, estado);
            stmt.setString(6, cidade);
            stmt.setString(7, tel);
            stmt.setString(8, email);
            stmt.setString(9, presenca_web);
            int add = stmt.executeUpdate();
            stmt.close();
            if(add > 0){
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            
            } 
       } catch (SQLException ex) {
	System.err.println("Erro INSERT: " + ex);
        JOptionPane.showMessageDialog(null, "Erro: "+ex);

       }
           }
       return retorno;
   } 
          public boolean insereLogadouros(String tabela, String idlogradouros,String uf,String idcidade ,String descricao,String bairros_idbairros, String cep)
   {
       boolean retorno = false;
       try {
          
           PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("insert into " +tabela+ " (idlogradouros,uf,idcidade,descricao,bairros_idbairros,cep) values ('" +idlogradouros+ "','" +uf+ "','" +idcidade+ "','" +descricao+ "','" +bairros_idbairros+"','"+cep+"');");//+ modelo +"',"+ano+");");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro INSERT: " + ex);
       }
       return retorno;
   }
   
    
   public boolean update(String idcidade, String cep, String uf, String descricao){
      boolean retorno = false; 
      String sql ="update cidades set descricao = ?, cep=?, uf=? where idcidade=?";
       try {
           PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, descricao);
        stmt.setString(2, cep);
        stmt.setString(3, uf);
        stmt.setString(4, idcidade);
        stmt.execute();
        stmt.close();
           
       } catch (SQLException ex) {
           	System.err.println("Erro INSERT: " + ex);
       }
      return retorno;
}
 public boolean insereCidade(String idcidade, String cep, String uf, String descricao){
      boolean retorno = false; 
      String sql ="insert into cidades(idcidade,cep,uf,descricao) values(?,?,?,?)";
       try {
           PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, idcidade);
        stmt.setString(2, cep);
        stmt.setString(3, uf);
        stmt.setString(4, descricao);
        stmt.execute();
        stmt.close();
           
       } catch (SQLException ex) {
           	System.err.println("Erro INSERT: " + ex);
       }
      return retorno;
}
 
  public boolean login(String usuario,String senha){
                String sql ="select * from login where usuario =? and senha=?";
        ResultSet rs = null;
    boolean check = false;
    if(!usuario.isEmpty() && !senha.isEmpty()) {
         try {
        PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();

             if (rs.next()){
              check = true;
            }
       } catch (Exception e) {
             System.out.println("erro "+e);
       }    
   }  
        return check;

   }

   public boolean insertBairro(String idbairros, String descricao, String uf, String cidades_idcidade ){
      boolean retorno = false; 
      String sql ="insert into bairros(idbairros, descricao, uf, cidades_idcidade) values (?,?,?,?)";
       try {
           PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, idbairros);
        stmt.setString(2, descricao);
        stmt.setString(3, uf);
        stmt.setString(4, cidades_idcidade );
        stmt.execute();
        stmt.close();
           
       } catch (SQLException ex) {
           	System.err.println("Erro INSERT: " + ex);
       }
      return retorno;
}
   
     
      public boolean updateL(String nome,String id, String endereco, String bairro, String cidade, String estado, String cep, String tel, String email, String presenca_web){
      boolean retorno = false; 
      //String sql ="update pessoas set nome = ?, endereco = ?, bairro = ?, cidade = ?, estado = ? , cep = ? , tel = ?, email = ?, presenca_web = ? WHERE nome=?";
               String sql ="update pessoas set nome=?, endereco=?, bairro=?, cidade = ?, estado=?, cep=?, tel = ?, email=?, presenca_web=? where id=?";
      try {
           PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, endereco);
        stmt.setString(3, bairro);
        stmt.setString(4, cidade);
        stmt.setString(5, estado);
        stmt.setString(6, cep);
        stmt.setString(7, tel);
        stmt.setString(8, email);
        stmt.setString(9, presenca_web);
        stmt.setString(10, id);
        stmt.executeUpdate();
        stmt.close();
           
       } catch (SQLException ex) {
           	System.err.println("Erro Update: " + ex);
       }
      return retorno;
}


   public boolean updatePessoas(String id,String nome, String endereco, String bairro, String cidade, String estado, String cep, String tel, String email, String presenca_web){
      boolean retorno = false; 
       try { 
       // PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("update "+tabela+" set nome=' " + nome +" ', tel = ' " +tel+ " ', cep = ' " +cep+ " ', endereco = ' " +endereco+ "', bairro = ' " +bairro+ " ', cidade = ' " +cidade+ " ', estado = ' " +estado+ " ', email = ' " +email+ " ', presenca_web = ' " +presenca_web+ " 'where nome=' " + nome+ " ' ");  
                PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement(
       "update pessoas set nome=' "+nome+ 
                    " ', endereco = ' " +endereco+ 
                    " ', bairro = ' " +bairro+ 
                    " ', cidade = ' " +cidade+ 
                    " ', estado = ' " +estado+ 
                    " ', cep = ' " +cep+ 
                    " ', tel = ' " +tel+ 
                    " ', email = ' " +email+ 
                    " ', presenca_web = ' " +presenca_web+ 
                    " ' where id=' " +id+ " ' ");
        stmt.executeUpdate();
        stmt.close();
        retorno = true;
           
       } catch (SQLException ex) {
           	System.err.println("Erro UPDATE: " + ex);
       }
      return retorno;

}
   
    public boolean delete(String tabela, String nome, String endereco, String bairro, String cidade, String estado, String cep, String tel, String email, String presenca_web)
   {
       boolean retorno = false;
       try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("DELETE FROM pessoas where nome= '"+nome+"'");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro DELETE: " + ex);
       }
       return retorno;
   }
    
          public boolean deletaLogadouros(String tabela, String idlogradouros,String uf,String idcidade ,String descricao,String bairros_idbairros, String cep)
   {
       boolean retorno = false;
       try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("DELETE FROM logradouros where idlogradouros= '"+idlogradouros+"'");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro DELETE: " + ex);
       }
       return retorno;
   }
     
            
                

  public boolean deleteBairro (String idbairros, String descricao, String uf, String cidades_idcidade)
   {
       boolean retorno = false;
       try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("DELETE FROM bairros where = '"+idbairros+"'");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro DELETE: " + ex);
       }
       return retorno;
   }
   
    public boolean deleteCidade (String idcidade, String cep, String uf, String descricao)
   {
       boolean retorno = false;
       try {
            PreparedStatement stmt = (PreparedStatement) this.con.prepareStatement("DELETE FROM cidades where idcidade= '"+idcidade+"'");
            stmt.execute();
            stmt.close();
            retorno = true;
       } catch (SQLException ex) {
	System.err.println("Erro DELETE: " + ex);
       }
       return retorno;
   }
     
}
