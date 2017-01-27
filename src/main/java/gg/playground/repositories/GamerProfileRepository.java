package gg.playground.repositories;

import gg.playground.entities.GamerProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Maksym_Mazur on 1/26/2017.
 */
public interface GamerProfileRepository extends MongoRepository<GamerProfile, Long> {

}
