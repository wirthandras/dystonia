package hu.wirthandras.dystonia.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.Yaml;

import hu.wirthandras.dystonia.question.Questions;

@Service
public class QuestionService {

	private static final String NO_QUESTION = "NO Question exists";
	private Questions q;

	private void lazyLoad()  throws IOException {
		if (q == null) {
			loadFromYaml();
		}
	}

	public String getQuestion() throws IOException {
		lazyLoad();
		return randomizeQuestion();
	}
	
	public String getQuestion(int index) throws IOException {
		lazyLoad();
		return q.getQuestions().get(index).getQuestion();
	}

	private String randomizeQuestion() {
		if (q.getQuestions() != null && q.getQuestions().size() > 0) {
			Random r = new Random();
			int index = r.nextInt(q.getQuestions().size());
			return q.getQuestions().get(index).getQuestion();
		} else {
			return NO_QUESTION;
		}
	}
	
	public void loadFromYaml() throws IOException {
		Yaml yaml = new Yaml();
		try (InputStream in = Questions.class.getResourceAsStream("/questions.yml")) {
			q = yaml.loadAs(in, Questions.class);
			System.out.println(q.toString());
		}
	}

}
