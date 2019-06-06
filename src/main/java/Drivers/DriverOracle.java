package Drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DriverOracle {

    public String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    public String USER = "system";
    public String PASS = "NeorisDatabase123";

    public DriverOracle() {
    }

    public Connection getConnection(){

        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            return con;

        } catch (Exception error) {
            System.out.println("Error: " + error);
            return null;
        }

    }
}
