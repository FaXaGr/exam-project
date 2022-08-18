package imtihons.controller;

import imtihons.dto.ResponseDto;
import imtihons.dto.StudentDto;
import imtihons.dto.TestObj;
import imtihons.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl service;

//    private final ValidatorService validatorService;
    private final TestObj testObj;

    @PostMapping("/add")
    public ResponseDto addStudent(@Valid @RequestBody StudentDto studentDto){





//       List<ValidatorDto> result = validatorService.cheekStudent(studentDto);
//       if (!result.isEmpty()){
//           return ResponseDto.builder().code(-1).message("err").errors(result).build();
//       }
       return service.addStudent(studentDto);
    }
}
