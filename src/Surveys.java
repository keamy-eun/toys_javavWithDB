import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Surveys {
    // 설문
    public void Survey(Statement statement) {
        System.out.println("설문시작");
        // 이름, 휴대폰 입력 / 확인
        System.out.print("이름 : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("휴대폰 : ");
        String phone_number = scanner.next();

        Commons commons = new Commons();
        String strDate = commons.getGeneratorId();
        String query = "INSERT INTO users_list (USERS_UID, PHONE, NAME)" +
                "VALUES ('" + strDate + "', '" + phone_number + "', '" + name + "')";
        try {
            statement.execute(query);

            // 설문 내용 출력
            query = "SELECT * FROM questions_list" +
                    "ORDER BY ORDERS";
            ResultSet resultSet = statement.executeQuery(query);
            // 설문자 답 받기
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ORDERS)"+". "));
                System.out.println(resultSet.getString("QUESTIONS"));
                
                // 설문 답항 출력
                query = 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
