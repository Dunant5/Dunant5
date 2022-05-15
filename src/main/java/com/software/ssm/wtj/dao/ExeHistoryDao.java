package com.software.ssm.wtj.dao;

import com.software.ssm.wtj.pojo.StuPaper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExeHistoryDao {
    public ExeHistoryDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ExeHistoryDao INSTANCE = new ExeHistoryDao();

    private static final String URL = "jdbc:mysql://112.74.60.132:3306/test_system?useUnicode=true&characterEncoding=UTF8&serverTimezone=UTC";
    private static final String USERNAME = "u1";
    private static final String PWD = "123456";
    private static final String SELECT_STU_PAPER_BY_ID_SQL = "SELECT * FROM `new` WHERE `topicId`=?";

    public List<StuPaper> selectStuPaperById(int stuId) throws Exception {
        List<StuPaper> stuPaperList = new ArrayList<>();

        Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
        PreparedStatement pstm = conn.prepareStatement(SELECT_STU_PAPER_BY_ID_SQL);
        pstm.setInt(1,stuId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            StuPaper stuPaper = new StuPaper();
            stuPaper.setStuId(rs.getInt("topicId"));
            stuPaper.setPaperId(rs.getString("point"));
            stuPaper.setScore(rs.getString("rAnswer"));
            stuPaperList.add(stuPaper);
        }

        rs.close();
        pstm.close();
        conn.close();

        return stuPaperList;
    }
}
