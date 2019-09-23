package ch.fhnw.webfr.flashcard.persistence;

import java.util.ArrayList;
import java.util.List;

import ch.fhnw.webfr.flashcard.domain.Questionnaire;

public class QuestionnaireRepository {
	
	private static QuestionnaireRepository instance;
	
	private List<Questionnaire> questionnaires = new ArrayList<Questionnaire>();
	
	private QuestionnaireRepository() {}
	
	public static QuestionnaireRepository getInstance() {
		
		if (instance == null) {
			instance = new QuestionnaireRepository();
		}
		
		return instance;
	}
	
	public Long save(Questionnaire q) {
		
		Long id = Long.valueOf(questionnaires.size());
		q.setId(id);
		questionnaires.add(q);
		
		return id;
	}
	
	public List<Questionnaire> findAll() {
		
		return questionnaires;
	}
	
	/**
	 * Returns the questionnaire with the ID, or null if not found.
	 * 
	 * @param id  The ID
	 * @return  The questionnaire with the ID, or null if not found
	 */
	public Questionnaire findById(Long id) {
		
		Questionnaire q = null;
		
		if(id < questionnaires.size()) {
			
			q = questionnaires.get(id.intValue());
		}
		
		return q;
	}
	
	public void clear() {
		
		questionnaires = new ArrayList<Questionnaire>();
	}
}
