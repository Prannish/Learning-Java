import java.sql.*;
import java.util.*;
class Main{
    public static void main(String[] args) {
        String uname="root";
        String pass="root";
        String path="jdbc:mysql://localhost:3306/world";

        String sql="CREATE TABLE hi ( PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255));";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,uname,pass);
            Statement st=con.createStatement();
            int m=st.executeUpdate(sql);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}