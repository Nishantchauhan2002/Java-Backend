import java.sql.*;
import java.util.*;


public class DemoJdbc {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try{
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            //Create Connection
            String url = "jdbc:postgresql://localhost:5432/demo";
            //url syntax = jdbc:+db_name(mysql, oracle, postgres):+your path or local address/+your db_name in post
            String user = "postgres";
            String password = "Nish$4626";

//            String query = "select sname from student where sid = 2010990122";
//            String query = "select * from student "; //select query

//            String query = "insert into student values ('naman',90,'b.sc')" ; //insert query

//            String query = "update student set sname='Max' where sid=90";
            String query = "delete from student where sid = 90";

            Connection con = DriverManager.getConnection(url,user,password);

            System.out.println("Connected to database successfully");
            Statement stmt = con.createStatement(); //Create a statement
            //CRUD Read part
//            ResultSet rs = stmt.executeQuery(query); // execute the query
//
//            while(rs.next()){
//                System.out.println("Student Name "+ rs.getString("sname") + "Student id == "+ rs.getString("sid"));
//            }

//            create part

            boolean check = stmt.execute(query);
            System.out.println(check);

            con.close(); // close the connection

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
