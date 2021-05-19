import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.sql.*;

public class Testconnect {
    @Test
    public void run1() {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://121.248.201.216:3306/MIS?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        // 数据库的用户名与密码，需要根据自己的设置
        String USER = "root";
        final String PASS = "admin";

        System.out.println("====");

        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM base_user";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");


                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 名称: " + name);

                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }
    @Test
   public void run2() {
        Jedis jedis = new Jedis("121.248.201.216",6379);
        System.out.println(jedis.ping());
    }


}
