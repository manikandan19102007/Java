Import java.sql.*;
Public class Test
{
Public static void main(String arr[])throws Exception
{
Connection con;
PreparedStatement ps;
Class.forName(“com.mysql.jdbc.Driver”);
Con=DriverManager.getConnection(“jdbc:mysql://localhost:3306/Sathya”,”root”,””);
Ps=con.prepareStatement(“insert into students values(777,’Tamil’,’BE(Cse)’,10)”);
Ps.executeUpdate();
Ps.close();
System.out.println(“Student Record Inserted”);
}
}

Import java.sql.;
Public class Test2
{
Public static void main(String arr[])throws Exception
{
Connection con;
PreparedStatement ps;
Class.forName(“com.mysql.jdbc.Driver”);
Con=DriverManager.getConnection(“jdbc:mysql://localhost:3306/Sathya”,”root”,””);
Ps=con.prepareStatement(“selectfrom students”);
ResultSet rs=ps.executeQuery();
While(rs.next())
{
System.out.println(“RegNo:\t”+rs.getInt(1));
System.out.println(“Name:\t”+rs.getString(2));
System.out.println(“Deg:\t”+rs.getString(3));
System.out.println(“CGP:\t”+rs.getFloat(4));
System.out.println(“--------------------------------“);
}
}
}
