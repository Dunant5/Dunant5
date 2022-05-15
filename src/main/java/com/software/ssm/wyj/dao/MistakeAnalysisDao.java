package com.software.ssm.wyj.dao;

import com.software.ssm.wtj.pojo.StuPaper;
import com.software.ssm.wyj.pojo.StuMistake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MistakeAnalysisDao {
    public MistakeAnalysisDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static MistakeAnalysisDao INSTANCE = new MistakeAnalysisDao();

    private static final String URL = "jdbc:mysql://112.74.60.132:3306/test_system?useUnicode=true&characterEncoding=UTF8&serverTimezone=UTC";
    private static final String USERNAME = "u1";
    private static final String PWD = "123456";
    private static final String SELECT_SQL = "SELECT `point`,COUNT(`point`),rAnswer FROM `new`,`new1` WHERE `stuId`=? AND `new1`.`topicId` = `new`.`topicId` AND `answer`!=`rAnswer` GROUP BY `point`";

    public List<StuMistake> selectMistakeById(int stuId) throws Exception {
        List<StuMistake> stuMistakeList = new ArrayList<>();

        Connection conn = DriverManager.getConnection(URL, USERNAME, PWD);
        PreparedStatement pstm = conn.prepareStatement(SELECT_SQL);
        pstm.setInt(1,stuId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            StuMistake stuMistake = new StuMistake();
            stuMistake.setPoint(rs.getString("point"));
            stuMistake.setCount(rs.getString("rAnswer"));
            stuMistakeList.add(stuMistake);
        }
        rs.close();
        pstm.close();
        conn.close();

        return stuMistakeList;
    }


}
