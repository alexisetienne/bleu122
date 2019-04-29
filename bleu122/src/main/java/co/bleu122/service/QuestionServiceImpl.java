package co.bleu122.service;

import java.util.List;

import bleu122.bleu122.entities.Question;
import co.bleu122.Dao.QuestionRepository;

public class QuestionServiceImpl implements QuestionService {
	
	private QuestionRepository questionRepository ; 

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
		
	}
	
	

}
