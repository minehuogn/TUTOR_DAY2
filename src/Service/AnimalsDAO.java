/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.*;

/**
 *
 * @author minehuogn
 */
public class AnimalsDAO {
    // các hàm để query data bằng select -> lấy data và in màn hình
    // dùng hàm resultset -> return stmt.excutequery
    // các hàm để chỉnh sửa data(insert, delete, update) 
    // dùng hàm boolean -> trả về true false -> return stmt.executeupdate > 0
    // hamf load data tu DB -> select

    public ResultSet loadAnimals() {
        try {
            Connection conn = DBConnection.connect();
            String query = "select * from Animals";
            PreparedStatement stmt = conn.prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        // select * from Animals where Name = ? 
    }

    public ResultSet searchAnimal(String NameAnimal) {
        try {
            Connection conn = DBConnection.connect();
            String query = "select * from Animals where Name like ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" +NameAnimal+"%");
            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    // tim dong vat trong khoang can nang tu ? den ?
    // select * from Animals where Weight between ? and ? 
    public ResultSet filterAnimal(float min,float max){
        try {
            Connection conn = DBConnection.connect();
            String query = "";
            PreparedStatement stmt = conn.prepareStatement("select * from Animals where Weight between ? and ?");
            
            stmt.setFloat(1, min);
            stmt.setFloat(2, max);
            return stmt.executeQuery();
                    
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
public ResultSet sortAnimal(float min,float max){
        try {
            Connection conn = DBConnection.connect();
            String query = "";
            PreparedStatement stmt = conn.prepareStatement("select * from Animals where Weight between ? and ?");
            
            stmt.setFloat(1, min);
            stmt.setFloat(2, max);
            return stmt.executeQuery();
                    
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
