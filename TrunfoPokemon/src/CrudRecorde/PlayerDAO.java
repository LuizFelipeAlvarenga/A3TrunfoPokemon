package CrudRecorde;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import trunfopokemon.Recorde;

public class PlayerDAO {

public void save(Recorde recorde){
    String sql = "INSERT INTO jogador(nome,pontuacao) VALUES(?,?)";
    Connection conn = null;
    PreparedStatement pstm = null;
    
        try{
 
            conn = Conectar.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, recorde.getNome());
            pstm.setInt(2, recorde.getPontos());

            pstm.execute();
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getRecordes() {
        StringBuilder sb = new StringBuilder();
        String sql = "SELECT * FROM jogador";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = Conectar.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                int pontos = rs.getInt("pontuacao");
                sb.append("Nome: ").append(nome).append(", Pontuação: ").append(pontos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
}