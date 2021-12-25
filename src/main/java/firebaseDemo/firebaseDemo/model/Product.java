package firebaseDemo.firebaseDemo.model;

import org.springframework.cloud.gcp.data.firestore.Document;

import com.google.cloud.firestore.annotation.DocumentId;

import lombok.Data;

@Data
@Document(collectionName = "products")
public class Product {
    @DocumentId()
    private String documentId;
    private String productName;
    private int unitPrice;
}