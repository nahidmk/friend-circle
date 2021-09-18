package book.friend.com.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "role")
public class Role implements Serializable {

    @Id
    private String _id;


    @NotNull
    @Size(max = 10, min = 5, message = "Not less then 5 and not grater then 10")
    private String alias;

    @NotNull
    @CreatedDate
    private LocalDate createdAt;


    @NotNull
    @LastModifiedDate
    private LocalDate updatedAt;

}
