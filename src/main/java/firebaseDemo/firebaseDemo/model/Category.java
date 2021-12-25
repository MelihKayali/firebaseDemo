package firebaseDemo.firebaseDemo.model;

import org.springframework.cloud.gcp.data.firestore.Document;

import com.google.cloud.firestore.annotation.DocumentId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "categories")
public class Category {
	
	@DocumentId
	String documentId;
	String categoryName;
	
}
