package hu.wirthandras.dystonia.question;

import java.util.List;

public class Questions {

	private List<Question> questions;
	
	public Questions() {
		
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Questions [questions=" + questions + "]";
	}	
	
}
