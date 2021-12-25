package firebaseDemo.firebaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import firebaseDemo.firebaseDemo.model.Category;

import firebaseDemo.firebaseDemo.repository.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
	private CategoryRepository categoryRepository;
	
	@Autowired
	public CategoriesController(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@GetMapping("/getAllCategories")
	public ResponseEntity<Flux<Category>> findAll() {
	return new ResponseEntity<>(this.categoryRepository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/saveAllCategories")
	public ResponseEntity<Mono<Category>> save(@RequestBody Category category) {
	return new ResponseEntity<>(this.categoryRepository.save(category), HttpStatus.OK);
	}

	@DeleteMapping("/deleteAllCategories/{documentId}")
	public ResponseEntity<Mono<Void>> delete(@PathVariable String documentId){
	return new ResponseEntity<>(this.categoryRepository.deleteById(documentId), HttpStatus.OK);
	}

	@PutMapping("/updateAllCategories")
	public ResponseEntity<Mono<Category>> update(@RequestBody Category category){
	return new ResponseEntity<>(this.categoryRepository.save(category), HttpStatus.OK);
   	
	}
	
}
