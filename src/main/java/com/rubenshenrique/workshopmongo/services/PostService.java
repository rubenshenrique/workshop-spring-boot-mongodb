package com.rubenshenrique.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubenshenrique.workshopmongo.domain.Post;
import com.rubenshenrique.workshopmongo.repository.PostRepository;
import com.rubenshenrique.workshopmongo.services.exception.ObjectNotFoundExcepetion;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto Não Encontrado"));
		}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
