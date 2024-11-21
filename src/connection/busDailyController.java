/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.dailyModel;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class busDailyController {
    private PreparedStatement p;
private DefaultTableModel tableModel;

    public busDailyController(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }
    public void addBusDailyToDatabase(dailyModel addData) {
    try {
        String sql = "INSERT INTO busdaily (busnumber, busseats, stoproutes, departuretime, driver, conductor) VALUES (?,?,?,?,?,?)";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setInt(1, addData.getBusNo());
        p.setInt(2, addData.getSeats());
        p.setString(3, addData.getRoute());
        p.setString(4, addData.getTimeSched());
        p.setString(5, addData.getDriver());
        p.setString(6, addData.getConductor());

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
public void deleteDailyToDatabase(dailyModel deleteData) {
    try {
        String sql = "DELETE FROM busdaily WHERE busnumber = ? AND busseats = ? AND stoproutes = ? AND departuretime = ? AND driver = ? AND conductor = ?";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setInt(1, deleteData.getBusNo());
        p.setInt(2, deleteData.getSeats());
        p.setString(3, deleteData.getRoute());
        p.setString(4, deleteData.getTimeSched());
        p.setString(5, deleteData.getDriver());
        p.setString(6, deleteData.getConductor());

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
    public void updateDailyToDatabase(dailyModel updateData, int idbusdaily) {
    String sql = "UPDATE busdaily SET busnumber = ?, busseats = ?, stoproutes = ?, departuretime = ?, driver = ?, conductor = ? WHERE idbusdaily = ?";
    
    try (PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql)) {
        
        // Set parameters for the prepared statement
        p.setInt(1, updateData.getBusNo());
        p.setInt(2, updateData.getSeats());
        p.setString(3, updateData.getRoute());
        p.setString(4, updateData.getTimeSched());
        p.setString(5, updateData.getDriver());
        p.setString(6, updateData.getConductor());
        p.setInt(7, idbusdaily);
        
        // Execute update and check if rows were affected
        int rowsAffected = p.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data updated successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Update failed. No rows were affected. Please check the ID or data and try again.", "Update Error", JOptionPane.WARNING_MESSAGE);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error updating datas: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Log error for debugging
    }
}

}
