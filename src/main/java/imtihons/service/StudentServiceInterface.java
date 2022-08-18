package imtihons.service;

import imtihons.dto.ResponseDto;
import imtihons.dto.StudentDto;

public interface StudentServiceInterface {
    ResponseDto addStudent(StudentDto studentDto);
}
