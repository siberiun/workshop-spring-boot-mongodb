package com.josenias.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josenias.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brom", "maria@gmail.com");
		User jose = new User("2", "José Brom", "josenias@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, jose));
		return ResponseEntity.ok().body(list);
	}
}
