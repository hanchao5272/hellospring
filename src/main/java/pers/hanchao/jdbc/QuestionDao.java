package pers.hanchao.jdbc;

import java.util.List;

public interface QuestionDao {
    public Question queryById(String id);
    public List<Question> queryAll();
    public void insert(Question question);
    public void deleteAll();
}
