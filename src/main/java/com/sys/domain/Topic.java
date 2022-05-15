package com.sys.domain;

public class Topic {
    private Integer topicId;
    private String description;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String point;
    private String rAnswer;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getrAnswer() {
        return rAnswer;
    }

    public void setrAnswer(String rAnswer) {
        this.rAnswer = rAnswer;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicId=" + topicId+
                ", description='" + description + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                ", point='" + point + '\'' +
                ", rAnswer='" + rAnswer + '\'' +
                '}';
    }
}
