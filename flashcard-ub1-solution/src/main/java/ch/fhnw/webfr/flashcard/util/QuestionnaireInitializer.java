package ch.fhnw.webfr.flashcard.util;

import java.util.logging.Logger;

import ch.fhnw.webfr.flashcard.domain.Questionnaire;
import ch.fhnw.webfr.flashcard.persistence.QuestionnaireRepository;

public class QuestionnaireInitializer {
	
	private static Logger logger = Logger.getLogger(QuestionnaireInitializer.class.getName());
	
	public QuestionnaireRepository initRepoWithTestData() {
		
		QuestionnaireRepository repo = QuestionnaireRepository.getInstance();
		
		repo.save(new Questionnaire("Test Questionnaire 1", "Lorem ipsum dolor sit amet..."));
		repo.save(new Questionnaire("Test Questionnaire 2", "Lorem ipsum dolor sit amet..."));
		repo.save(new Questionnaire("i18n Test fünf", "Lorem ipsum dolor sit amet..."));
		
		logger.info("Questionnaires initialized successfully");
		
		return repo;
	}

}
