/*
package com.itliusir.boot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringBootStarterApplicationTests {

    @Test
    public void contextLoads() {
    }

private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

	@After
	public void init() {
		if (this.context != null) {
			this.context.close();
		}
	}

	@Test
	public void userName() {
		EnvironmentTestUtils.addEnvironment(this.context,
				"user.config.name:");
		this.context.register(UserConfigAutoConfiguration.class,
				TestConfiguration.class);
		this.context.refresh();
		assertEquals("demo-spring-boot-starter",this.context.getBean(UserProperties.class).getName());
	}

	@Configuration
	@EnableConfigurationProperties(UserProperties.class)
	protected static class TestConfiguration {

	}

}
*/
