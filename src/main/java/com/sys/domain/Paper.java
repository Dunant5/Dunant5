package com.sys.domain;

public class Paper {
    private Integer stuId;
    private Integer paperId;
    private String topicId;
    private Integer score;
    private String paperName;

    @Override
    public String toString() {
        return "Paper{" +
                "paperId=" + paperId +
                ", stuId=" + stuId +
                ", topicId='" + topicId + '\'' +
                ", score=" + score +
                ", paperName='" + paperName + '\'' +
                '}';
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }
}
