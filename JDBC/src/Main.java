import java.sql.*;

public class Main {

        public static final String DB_URL = "jdbc:mysql://localhost/patika";
        public static final String DB_USER = "root";
        public static final String DB_PASSWORD = "mysql";

        public static void main(String[] args) {
            Connection connect = null;
            Statement st = null;
            String sql = "SELECT * FROM employees";
            try {
                connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                st = connect.createStatement();
                ResultSet info = st.executeQuery(sql);
                while (info.next()){
                    System.out.println("ID: " + info.getInt("id"));
                    System.out.println("NAME: " + info.getString("name"));
                    System.out.println("POSITION: " + info.getString("position"));
                    System.out.println("SALARY: " + info.getInt("salary"));
                    System.out.println("---------------");

                }
                info.close();
                connect.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

}
