/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import models.staffModel;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class staffController {
    private PreparedStatement p;
private DefaultTableModel tableModel;

public staffController(DefaultTableModel tableModel) {
    this.tableModel = tableModel;
}

public void addStaffToDatabase(staffModel addData) {
    try {
        String sql = "INSERT INTO staff (name, job, age, gender) VALUES (?,?,?,?)";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, addData.getName());
        p.setString(2, addData.getJob());
        p.setInt(3, addData.getAge());
        p.setString(4, addData.getGender());

        int rowsAffected = p.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data added successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add data.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error adding data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (p != null) p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public void deleteStaffToDatabase(staffModel deleteData) {
    try {
        String sql = "DELETE FROM staff WHERE name = ? AND job = ? AND age = ? AND gender = ?";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, deleteData.getName());
        p.setString(2, deleteData.getJob());
        p.setInt(3, deleteData.getAge());
        p.setString(4, deleteData.getGender());

        int rowsAffected = p.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add data.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error adding data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (p != null) p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public void updateStaffToDatabase(staffModel updateData, int id) {
    try {
        String sql = "UPDATE staff SET name = ?, job = ?, age = ?, gender = ? WHERE idstaff = ?";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        
        p.setString(1, updateData.getName());
        p.setString(2, updateData.getJob());
        p.setInt(3, updateData.getAge());
        p.setString(4, updateData.getGender());
        p.setInt(5, id);
        int rowsAffected = p.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data updated successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add data.");
        }  
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error adding data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (p != null) p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}
