package com.software.ssm.wtj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StuPaper {
    private int stuId;
    private String paperId;
    private String topicId;
    private String score;


    private String point;
    private String rAnswer;
}
