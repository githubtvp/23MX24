import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
class DBConnect {

        private static final String DRVR = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/mydb";
        private static final String USER  = "root";
        private static final String PWD = "rootmysql";

        public Connection conn;
        public Statement stmt;
        public DBConnect()
        {
            OpenConnection();
        }
        private void OpenConnection() {

            try{
                //1. Load necessary drivers for jdbc
                Class.forName(DRVR);
                conn = DriverManager.getConnection(URL, USER, PWD);
                stmt = conn.createStatement();
               // pr("DB Connected");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        private void pr(String msg)
        {
            System.out.println(msg);
        }


}
