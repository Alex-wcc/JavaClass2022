package JDBC;

import java.sql.*;

//mysqld --console　　


public class PreparedStatement {


    public static void main(String[] args) {

        Connection conn = null;

        Statement stmt = null;

        try {

            Conn c = new Conn();

            conn = c.getConnection();

            //添加 PreparedStatement的更新操作

            java.sql.PreparedStatement ps;
            ps = conn.prepareStatement("select * from websites where country = ? ");

            ps.setString(1, "CN");

            ResultSet set = ps.executeQuery();

            while (set.next()) {
                // 通过字段检索
                int id = set.getInt(1);
                String name = set.getString("name");
                String url = set.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }


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


    }

}