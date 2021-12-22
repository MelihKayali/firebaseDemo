package firebaseDemo.firebaseDemo.model;

import org.springframework.cloud.gcp.data.firestore.Document;


import com.google.cloud.firestore.annotation.DocumentId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collectionName = "product")
public class Product {
	@DocumentId
	private String id;
	private String productName;
	private int unitPrice;
	private User user;
	
	
}
