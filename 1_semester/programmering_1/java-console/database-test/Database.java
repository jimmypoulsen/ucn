import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Database {
  private static final String url = "jdbc:mysql://localhost:3306/java_test";
  private static final String user = "root";
  private static final String password = "";
  private static Connection con;
  private static Statement stmt;
  private static ResultSet rs;

  public void execute() {
    String query = "select count(*) from users";

    try {
      // open database connection to MySQL server
      con = DriverManager.getConnection(url, user, password);

      // get Statement object to execute query
      stmt = con.createStatement();

      // execute query
      rs = stmt.executeQuery(query);

      while (rs.next()) {
        int count = rs.getInt(1);
        System.out.println("Total number of users: " + count);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // close con, stmt, rs
      try {
        con.close();
      } catch (SQLException se) {
      }
      try {
        stmt.close();
      } catch (SQLException se) {
      }
      try {
        rs.close();
      } catch (SQLException se) {
      }
    }
  }
}