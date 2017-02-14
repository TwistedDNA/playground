package gg.playground;


import gg.playground.entities.Activity;
import gg.playground.entities.Day;
import gg.playground.repositories.ActivityRepository;
import gg.playground.repositories.DayRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaygroundApplicationTests {

	@Autowired
	private DayRepository dayRepository;
	@Autowired
	private ActivityRepository activityRepository;
	private Day day;
	private Activity activity;

	@Before
	public void before(){
		day = new Day();
		day.setDate(LocalDate.now());
		day.setActivities(new ArrayList<>());

		activity = new Activity();
		activity.setName("New activity");
	}

	@Test
	public void saveReadActivity() {
		activityRepository.deleteAll();
		activityRepository.save(activity);
		Activity returned = activityRepository.findAll().stream().findFirst().get();
		assertThat(returned).isEqualToComparingFieldByField(activity);
	}

	@Test
	public void saveReadDay() {
		dayRepository.deleteAll();
		dayRepository.save(day);
		Day returned = dayRepository.findAll().stream().findFirst().get();
		assertThat(returned).isEqualToComparingFieldByField(day);
	}

}
