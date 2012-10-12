package org.springframework.issues;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigClass {

	@Bean
	public Example example() {
		return new Example();
	}

}
