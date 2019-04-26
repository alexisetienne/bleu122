package co.bleu122.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import bleu122.bleu122.entities.*;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
