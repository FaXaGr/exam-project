package imtihons.service.impl;

import imtihons.dto.StudentDto;
import imtihons.dto.ValidatorDto;

import java.util.ArrayList;
import java.util.List;

public class ValidatorService {
    public List<ValidatorDto> cheekStudent(StudentDto studentDto){
        List<ValidatorDto> err = new ArrayList<>();
        if (studentDto.id == null){
            err.add(new ValidatorDto("id","id is null"));
        }if (studentDto.email == null){
            err.add(new ValidatorDto("email","null"));
        }if (studentDto.name.length()<3){
            err.add(new ValidatorDto("name","3 ta harfdan kk bo'lishi kk"));
        }
        return err;
    }
}

