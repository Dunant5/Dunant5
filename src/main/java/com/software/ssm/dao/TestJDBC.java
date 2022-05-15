package com.software.ssm.dao;

import java.sql.*;

public class TestJDBC {

    public static void main(String[] args) throws Exception {
        new TestJDBC().test();
    }
    private static final String URL = "jdbc:mysql://112.74.60.132:3306/test_system?useUnicode=true&characterEncoding=UTF8&serverTimezone=UTC";
    private static final String USERNAME = "u1";
    private static final String PWD = "123456";
    private static final String SQL = "SELECT * FROM `tb_topic`";


    public void test() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
        PreparedStatement pstm = conn.prepareStatement(SQL);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("description").trim());
        }

        rs.close();
        pstm.close();
        conn.close();
    }

}
