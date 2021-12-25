package firebaseDemo.firebaseDemo.controller;

import firebaseDemo.firebaseDemo.model.Product;
import firebaseDemo.firebaseDemo.model.dtos.ProductDto;
import firebaseDemo.firebaseDemo.repository.ProductRepository;
import firebaseDemo.firebaseDemo.utilities.DtoConverterService;

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
	private DtoConverterService dtoConverterService;
	
	@Autowired
	public ProductsController(ProductRepository productRepository,DtoConverterService dtoConverterService) {
		this.productRepository = productRepository;
		this.dtoConverterService = dtoConverterService;
	}
	
	@GetMapping("/getAllProducts")
		public ResponseEntity<Flux<Product>> findAll() {
		return new ResponseEntity<>(this.productRepository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/saveAllProducts")
	public ResponseEntity<Mono<Product>> save(@RequestBody  ProductDto productDto) {
		return new ResponseEntity<>(this.productRepository.save((Product) dtoConverterService.dtoClassConverter(productDto, Product.class)), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAllProducts/{documentId}")
	public ResponseEntity<Mono<Void>> delete(@PathVariable String documentId){
		return new ResponseEntity<>(this.productRepository.deleteById(documentId), HttpStatus.OK);
	}
	
	@PutMapping("/updateAllProducts")
	public ResponseEntity<Mono<Product>> update(@RequestBody ProductDto productDto){
		return new ResponseEntity<>(this.productRepository.save((Product) dtoConverterService.dtoClassConverter(productDto, Product.class)), HttpStatus.OK);
       	
	}
	
	

	
}
