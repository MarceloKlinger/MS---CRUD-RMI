package dao;

import classes.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataDAO {
    public static void insert(Data data){
        String sql = "INSERT INTO data (dia, mes, ano) VALUES (?, ?, ?)";
        
        try {
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, data.getDia());
            stmt.setInt(2, data.getMes());
            stmt.setInt(3, data.getAno());
            stmt.execute();
        } catch(Exception e) {
            System.out.println("Erro na função insert: " + e.toString());
        }
    }
    
    
    public void update(){
        
    }
    
    public static ArrayList<Data> select(){
        
        ArrayList<Data> datas = new ArrayList<>();
        
        String sql = "SELECT * FROM data";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet registro = stmt.executeQuery();
            
            while (registro.next()){
                Data temporario = new Data();
                    temporario.setDia(registro.getInt("dia"));
                    temporario.setMes(registro.getInt("mes"));
                    temporario.setAno(registro.getInt("ano"));
                datas.add(temporario);
            }
            
            return datas;
        } catch(Exception e){
            System.err.println("Erro na Listagem de Data: " + e.toString());
        }
        
        return null;
    }
    
    public void delete(){
        
    }
}
