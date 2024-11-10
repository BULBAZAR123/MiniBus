
package connection;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.monthlyModel;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class busMonthlyController {
    private PreparedStatement p;
private DefaultTableModel tableModel;

public busMonthlyController(DefaultTableModel tableModel) {
    this.tableModel = tableModel;
}
public void addBusMonthlyToDatabase(monthlyModel addData) {
    try {
        String sql = "INSERT INTO busmonthly (route, estimatedtime) VALUES (?,?)";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, addData.getRoute());
        p.setString(2, addData.getEstimatedtime());

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
public void deleteMonthlyToDatabase(monthlyModel deleteData) {
    try {
        String sql = "DELETE FROM busmonthly WHERE route = ? AND estimatedtime = ?";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, deleteData.getRoute());
        p.setString(2, deleteData.getEstimatedtime());

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
    public void updateMonthlyToDatabase(monthlyModel updateData, int idbus) {
    try {
        String sql = "UPDATE busmonthly SET route = ?, estimatedtime = ? WHERE idbus = ?";
        
        p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        
        p.setString(1, updateData.getRoute());
        p.setString(2, updateData.getEstimatedtime());
        p.setInt(3, idbus);
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
