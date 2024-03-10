import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {
    public static void main(String[] args) throws ClassNotFoundException {
        
    
        // Try block to check if any exceptions occur
        try {
 
            // Step 2: Loading and registering drivers
 
            // Loading driver using forName() method
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Registering driver using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306//data", "root", "");
 
            // Step 3: Create a statement
            Statement statement = con.createStatement();
            String sql = "select * from user";
 
            // Step 4: Execute the query
            ResultSet result = statement.executeQuery(sql);
 
            // Step 5: Process the results
 
            // Condition check using hasNext() method which
            // holds true till there is single element
            // remaining in List
            while (result.next()) {
 
                // Print name an age
                System.out.println(
                    "Name: " + result.getString("username"));
                System.out.println(
                    "pass:" + result.getString("password"));
            }
        }
 
        // Catching database exceptions if any
        catch (SQLException e) {
 
            // Print the exception
            System.out.println(e);
        }
 
        // Catching generic ClassNotFoundException if any
        // catch (ClassNotFoundException e) {
 
        //     // Print and display the line number
        //     // where exception occurred
        //     e.printStackTrace();
    
    }
    }
