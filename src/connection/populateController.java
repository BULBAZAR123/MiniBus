package connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class populateController {
     public static void populateStaffTable( JTable table) {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        
        ps = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT * FROM staff");
       

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
        rs = ps.executeQuery();
        while (rs.next()) {
           
            
                
            
                Vector <Object> v = new Vector<>();
                v.add(rs.getString("name"));
                v.add(rs.getString("job"));
                v.add(rs.getString("age"));
                v.add(rs.getString("gender"));
                v.add(rs.getInt("idstaff"));
                model.addRow(v);
           
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       e.printStackTrace();
        }
    }
   }
    public static void populateMonthlyTable( JTable table) {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        
        ps = DatabaseConnection.getInstance().getConnection().prepareStatement("SELECT * FROM busmonthly");
       

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
        rs = ps.executeQuery();
        while (rs.next()) {
           
            
                
            
                Vector <Object> v = new Vector<>();
                v.add(rs.getString("route"));
                v.add(rs.getString("estimatedtime"));
                v.add(rs.getInt("idbus"));
                model.addRow(v);
           
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       e.printStackTrace();
        }
    }
   } 
}
