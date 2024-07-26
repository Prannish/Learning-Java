import java.sql.*;
class Main{
    public static void main(String[] args) {
        String uname="root";
        String pass="root";
        String path="jdbc:mysql://localhost:3306/student";
        String sql="Delete from stu";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,uname,pass);
            Statement st=con.createStatement();
            int m=st.executeUpdate(sql);
            System.out.println("Records deleted success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}