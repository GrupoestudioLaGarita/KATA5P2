package kata5p2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {

    private Connection connect() {
        String url = "jdbc:sqlite:KATA5.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return conn;
    }

    public List<String> read() {
        String sql = "SELECT * FROM direcc_email";
        List<String> mailList = new ArrayList<>();

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                mailList.add(rs.getString("direccion"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mailList;
    }
    
}