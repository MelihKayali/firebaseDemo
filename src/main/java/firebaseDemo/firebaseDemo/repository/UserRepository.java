package firebaseDemo.firebaseDemo.repository;

import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import firebaseDemo.firebaseDemo.model.User;
import reactor.core.publisher.Flux;



@RepositoryRestResource
public interface UserRepository extends FirestoreReactiveRepository<User>{
	 Flux<User> findUserByEmail(String email);

	 
}
