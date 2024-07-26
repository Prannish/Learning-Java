import java.sql.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String uname = "root";
        String pass = "root";
        Scanner k = new Scanner(System.in);
        System.out.println("Enter database you want to create");
        String db = k.next();
        String sql = "create database "+db;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1) {
                System.out.println("Successfully created" + sql);
            } else
                System.out.println("Database creation failed");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}