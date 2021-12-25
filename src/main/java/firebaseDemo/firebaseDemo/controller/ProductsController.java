package firebaseDemo.firebaseDemo.controller;

import firebaseDemo.firebaseDemo.model.Product;
import firebaseDemo.firebaseDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/products")
public class ProductsController {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductsController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping("/getAllProducts")
		public ResponseEntity<Flux<Product>> findAll() {
		return new ResponseEntity<>(this.productRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/saveAllProducts")
	public ResponseEntity<Mono<Product>> save(@RequestBody Product product) {
		return new ResponseEntity<>(this.productRepository.save(product), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAllProducts/{documentId}")
	public ResponseEntity<Mono<Void>> delete(@PathVariable String documentId){
		return new ResponseEntity<>(this.productRepository.deleteById(documentId), HttpStatus.OK);
	}
	
}
