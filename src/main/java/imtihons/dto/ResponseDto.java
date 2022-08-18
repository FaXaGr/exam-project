package imtihons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto<T> {
    private Integer code;
    private String message;
    private Boolean successfully;
    List<ValidatorDto> errors;
    private T e;
}
