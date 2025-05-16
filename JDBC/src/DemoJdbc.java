import java.awt.*;
import java.sql.*;
import java.util.*;


public class DemoJdbc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
//            String query = "delete from student where sid = 90";
            System .out.println("Insert the inputs for student .........");
            System.out.print("Enter student NAME : ");
            String sname = sc.nextLine();
            System.out.print("Enter student ID : ");

            int sid = sc.nextInt();
            System.out.print("Enter student DEPT : ");

            String dept = sc.nextLine();
            sc.next();

//            String query = "insert into student values ('"+sname+"',"+sid+",'"+dept+"')";
            String query = "insert into student values (?,?,?)"; //using query for preparedStatement

            Connection con = DriverManager.getConnection(url,user,password);

            System.out.println("Connected to database successfully");
//            Statement stmt = con.createStatement(); //Create a statement
             PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,sname);
            stmt.setInt(2,81223);
            stmt.setString(3,dept);


            //CRUD Read part
//            ResultSet rs = stmt.executeQuery(query); // execute the query
//
//            while(rs.next()){
//                System.out.println("Student Name "+ rs.getString("sname") + "Student id == "+ rs.getString("sid"));
//            }

//            create part

//            boolean check = stmt.execute(query);
//            System.out.println(check);

            boolean check = stmt.execute();//For the Prepared Statement
            System.out.println(check);

            con.close(); // close the connection

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
