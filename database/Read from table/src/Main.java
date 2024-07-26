import java.sql.*;
class Main{
    public static void main(String[] args) {
        String uname="root";
        String pass="root";
        String path="jdbc:mysql://localhost:3306/student";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,uname,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select address from stu");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}