package gg.playground.repositories;

import gg.playground.entities.Day;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Maksym_Mazur on 1/26/2017.
 */
public interface DayRepository extends MongoRepository<Day, String> {

}
