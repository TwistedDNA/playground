package gg.playground;


import static org.assertj.core.api.Assertions.assertThat;

import gg.playground.entities.GamerProfile;
import gg.playground.repositories.GamerProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaygroundApplicationTests {

	@Autowired
	private GamerProfileRepository gamerProfileRepository;
	private GamerProfile gamerProfile;

	@Before
	public void before(){
		gamerProfile = new GamerProfile("Leroy", "Jenkins");
	}

	@Test
	public void saveReadFromMongo() {
		gamerProfileRepository.deleteAll();
		gamerProfileRepository.save(gamerProfile);
		GamerProfile returned = gamerProfileRepository.findAll().stream().findFirst().get();
		assertThat(returned).isEqualToComparingFieldByField(gamerProfile);
	}

}
