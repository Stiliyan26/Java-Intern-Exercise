package testDb.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
                    .getConnection("jdbc:sqlite:C:\\databases\\testjava.db");
            //conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                            "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Joe', 465123, 'joe@email.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jane', 4853123, 'jane@email.com')");
//
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Dosg', 92038, 'dosg@email.com')");

            statement.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
