package book.friend.com.Model;

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
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @Created 9/17/2021
 * @Project Friend Cricle
 * @Time 9:44 PM
 * @Author Nahid
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "group")
public class Group implements Serializable {
    @Id
    private String _id;

    @NotNull
    @Size(min = 4, max = 20, message = "Not less then 4")
    private String groupName;


    @NotNull
    @CreatedDate
    private LocalDate createdAt;

    @NotNull
    @LastModifiedDate
    private LocalDate updatedAt;

    @DBRef(lazy = true)
    private List<User> groupMember;

    @DBRef(lazy = true)
    @CreatedBy
    private User CreatedBy;

}
