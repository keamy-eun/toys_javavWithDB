import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Commons {
    public Statement getStatement(){
        String url = "jdbc:mysql://localhost:3306/toys_javaWithDB";
        String user = "root";
        String password = "*khacademy!";
        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return statement;
    }  

    public String getGeneratorId(){
        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");  
        String strDate = formatter.format(date);
        return strDate;
    }
}
