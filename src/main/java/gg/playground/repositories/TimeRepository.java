package gg.playground.repositories;

import gg.playground.entities.LocalTimeWrapper;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Maksym_Mazur on 3/29/2017.
 */

public interface TimeRepository extends MongoRepository<LocalTimeWrapper, String> {

}
