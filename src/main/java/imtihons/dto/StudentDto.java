package imtihons.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    public Integer id;
    @Size(min = 3,max = 10)
    @NotNull
    public  String name;
    public String email;
}
