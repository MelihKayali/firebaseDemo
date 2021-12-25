package firebaseDemo.firebaseDemo.model.dtos;

import org.springframework.cloud.gcp.data.firestore.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "products")
public class ProductDto {
	private String productName;
	private int unitPrice;
	private String categoryDocumentId;
}
