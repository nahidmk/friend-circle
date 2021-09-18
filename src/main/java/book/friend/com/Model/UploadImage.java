package book.friend.com.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

/**
 * @Created 9/17/2021
 * @Project Friend Cricle
 * @Time 9:36 PM
 * @Author Nahid
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "upload_image")
public class UploadImage {
    @Id
    private String _id;

    @NotNull
    private String image;
}
