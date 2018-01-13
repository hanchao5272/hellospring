package pers.hanchao.jdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p>通过继承JdbcDaoSupport，简化了对JdbcTemplate和dataSource的装载。
 * 通过JdbcTemplate提供的API，实现了几个简单的SQL操作</p>
 * @author hanchao 2018/1/10 22:51
 **/
public class QuestionDaoImpl extends JdbcDaoSupport implements QuestionDao {

    public Question queryById(String id) {
        String sql = "SELECT * FROM question WHERE id = ?";
        return getJdbcTemplate().queryForObject(sql,new Object[]{id},new RowMapper<Question>() {
            public Question mapRow(ResultSet resultSet, int i) throws SQLException {
                Question question = new Question();
                question.setId(resultSet.getInt("id"));
                question.setTitle(resultSet.getString("title"));
                question.setScore(resultSet.getInt("score"));
                question.setAnswer(resultSet.getString("answer"));
                return question;
            }
        });
    }

    public List<Question> queryAll() {
        List queryForList = getJdbcTemplate().queryForList("SELECT * FROM question");
        List<Question> questionList = new ArrayList<Question>();
        Iterator iterator = queryForList.iterator();
        while (iterator.hasNext()){
            Map result = (Map) iterator.next();
            long idl = (Long) result.get("id");
            int id = (int)idl;
            String title = (String ) result.get("title");
            int score = (Integer) result.get("score");
            String answer = (String ) result.get("answer");
            Question question = new Question(id,title,score,answer);
            questionList.add(question);
        }
        return  questionList;
    }

    public void insert(Question question) {
        getJdbcTemplate().update("INSERT INTO question(title,score,answer) VALUES (?,?,?)",new Object[]{question.getTitle(),question.getScore(),question.getAnswer()});
    }

    public void deleteAll() {
        getJdbcTemplate().update("DELETE FROM question");
    }
}
