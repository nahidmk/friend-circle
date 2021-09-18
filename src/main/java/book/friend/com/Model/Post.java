package book.friend.com.Model;

import book.friend.com.Enum.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "post")
public class Post {

    @Id
    private String _id;

    @NotNull
    @Size(min = 4, message = "Not less then 4")
    private String description;

    @NotNull
    private Status status;


    @NotNull
    private List<UploadImage> uploadImageList;

    @NotNull
    @CreatedDate
    private LocalDate createdAt;


    @NotNull
    @LastModifiedDate
    private LocalDate updatedAt;

    @NotNull
    @CreatedBy
    @DBRef(lazy = true)
    private User createdBy;

    @DBRef(lazy = true)
    private User user;
}
