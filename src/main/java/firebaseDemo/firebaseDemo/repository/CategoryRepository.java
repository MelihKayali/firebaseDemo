package firebaseDemo.firebaseDemo.repository;

import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import firebaseDemo.firebaseDemo.model.Category;

@RepositoryRestResource
public interface CategoryRepository extends FirestoreReactiveRepository<Category> {


}
