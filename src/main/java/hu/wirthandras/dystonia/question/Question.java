package hu.wirthandras.dystonia.question;

public class Question {
	
	private String question;
	
	public Question() {
	
	}

	@Override
	public String toString() {
		return "Question [question=" + question + "]";
	}

	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}

}
