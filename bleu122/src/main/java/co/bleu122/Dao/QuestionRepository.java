package co.bleu122.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bleu122.bleu122.entities.Question;

public interface  QuestionRepository extends JpaRepository<Question, Long> {

}
