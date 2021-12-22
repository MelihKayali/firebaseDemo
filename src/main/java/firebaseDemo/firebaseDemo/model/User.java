package firebaseDemo.firebaseDemo.model;

import org.springframework.cloud.gcp.data.firestore.Document;


import com.google.cloud.firestore.annotation.DocumentId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collectionName = "user")
public class User {
	@DocumentId
	private String id;
	private String email;
	private String userName;
	private String userSurname;
	
}
