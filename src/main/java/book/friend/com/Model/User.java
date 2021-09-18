package book.friend.com.Model;

import book.friend.com.Enum.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String _id;

    @NotNull
    @Size(min = 4, max = 20, message = "Not less then 4 and not grater then 20")
    private String name;

    @NotNull
    @Size(min = 4, max = 15, message = "Not less then 4 and not grater then 20")
    private String phone;

    @NotNull
    @Email(regexp = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$", message = "should be valid email")
    @Size(min = 4, max = 20, message = "Not less then 4 and not grater then 20")
    private String email;

    @NotNull
    @Size(min = 4, max = 50, message = "Not less then 4 and not grater then 50")
    private String address;

    @NotNull
    @Size(min = 6, max = 10, message = "Not less then 6 and not grater then 10")
    private String password;


    @NotNull
    private String profilePicture;

    @NotNull
    private Gender gender;

    @NotNull
    private  boolean banned;

    @NotNull
    @CreatedDate
    private LocalDate createdAt;

    @NotNull
    @LastModifiedDate
    private LocalDate updatedAt;





}
