package com.aop.springaop;

import com.aop.springaop.service.ConsumerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringaopApplicationTests {

	@Autowired
	ConsumerService consumerService;

	@Test
	void testBeforeLog() {
		consumerService.consumer();
	}

}
