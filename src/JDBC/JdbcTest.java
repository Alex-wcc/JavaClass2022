package JDBC;

import java.sql.*;

//mysqld --console　　



class Conn {

    Connection con;

    public Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");  System.out.println("wcc-数据库驱动加载成功");

        } catch(ClassNotFoundException e){

            e.printStackTrace();

        }

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","javaclass","12345678");



            System.out.println("wcc-数据库连接成功");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return con;

    }



}



public class JdbcTest {





    public static void main(String[] args) {

        Connection conn = null;

        Statement stmt = null;

        try{

            Conn c = new Conn();

            conn = c.getConnection();

            //添加 增删改查操作

            stmt = conn.createStatement();
            String sql = "SELECT id, name, url FROM websites";

            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt(1);
                String name = rs.getString("name");
                String url = rs.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }

            rs.close();
            stmt.close();
            conn.close();

        }catch(SQLException se){

            // 处理 JDBC 错误

            se.printStackTrace();

        }catch(Exception e){

            // 处理 Class.forName 错误

            e.printStackTrace();

        }finally{

            // 关闭资源

            try{

                if(stmt!=null) stmt.close();

            }catch(SQLException se2){

            }// 什么都不做

            try{

                if(conn!=null) conn.close();

            }catch(SQLException se){

                se.printStackTrace();

            }

        }



    }

}