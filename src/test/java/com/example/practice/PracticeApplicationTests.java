package com.example.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----------");

		//Text JSON -> Object
		//object -> Text Json

		//Controller req json(text) -> ojbect
		// response object -> json(text)

		var objectMapper = new ObjectMapper();

		//object -> text
		//object mapper get method를 활용한다
		var user = new User("steve",10, "010-1234-5678");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		//text -> object
		//object mapper는 default 생성자를 필요로 한다.
		var objectUser = objectMapper.readValue(text,User.class);
		System.out.println(objectUser);
	}


}
