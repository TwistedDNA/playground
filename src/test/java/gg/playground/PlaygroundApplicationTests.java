package gg.playground;


import static org.assertj.core.api.Assertions.assertThat;

import gg.playground.entities.Gg;
import gg.playground.repositories.GgRepository;
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
	private GgRepository ggRepository;
	private Gg gg;

	@Before
	public void before(){
		gg = new Gg("Alfa");
	}

	@Test
	public void saveReadFromMongo() {
		ggRepository.deleteAll();
		ggRepository.save(gg);
		Gg returned = ggRepository.findAll().stream().findFirst().get();
		assertThat(returned).isEqualToComparingFieldByField(gg);
	}

}
