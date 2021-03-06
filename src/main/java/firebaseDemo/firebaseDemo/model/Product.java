package firebaseDemo.firebaseDemo.model;



import org.springframework.cloud.gcp.data.firestore.Document;


import com.google.cloud.firestore.annotation.DocumentId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "products")
public class Product {
    @DocumentId()
    private String documentId;
    private String productName;
    private int unitPrice;
    private Category category;

}