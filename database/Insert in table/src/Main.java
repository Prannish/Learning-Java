import java.sql.*;
class Main{
    public static void main(String[] args) {
        String name="root";
        String pass="root";
        String url="jdbc:mysql://localhost:3306/6java";
        String sql="insert into advance(id,name,address) values('1','Ramesh','kalanki'),('2','shyam','thapathali')";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Inserted Success");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}