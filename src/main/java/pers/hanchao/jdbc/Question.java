package pers.hanchao.jdbc;

import java.io.Serializable;

public class Question implements Serializable{
    /**
     * 试题id
     */
    private int id;
    /**
     * 题目
     */
    private String title;
    /**
     * 分数
     */
    private int score;
    /**
     * 答案
     */
    private String answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question(){}

    public Question(int id, String title, int score, String answer){
        this.id = id;
        this.title = title;
        this.score = score;
        this.answer = answer;
    }
    public Question(String title,int score,String answer){
        this(0,title,score,answer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", answer='" + answer + '\'' +
                '}';
    }
}
