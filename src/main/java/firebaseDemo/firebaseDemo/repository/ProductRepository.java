package firebaseDemo.firebaseDemo.repository;

import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import firebaseDemo.firebaseDemo.model.Product;

@RepositoryRestResource
public interface ProductRepository extends FirestoreReactiveRepository<Product>{
	
	
}
