package imtihons.service.impl;

import imtihons.dto.ResponseDto;
import imtihons.dto.StudentDto;
import imtihons.entity.Student;
import imtihons.repository.StudentRepository;
import imtihons.service.StudentServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentServiceInterface {
    private final StudentRepository repository;
    @Override
    public ResponseDto addStudent(StudentDto studentDto) {
       Student a = Student.builder().id(studentDto.getId()).name(studentDto.getName()).email(studentDto.getEmail()).build();
       repository.save(a);
       return ResponseDto.builder().code(0).message("successfully").successfully(true).build();
    }
//    @Bean
//    @Scope(value = "prototype")
//    public TestObj prototype(){
//        return new TestObj();
//    }

//    @Bean
//    @Scope(value = "singleton")
//    public TestObj singleton(){
//        return new TestObj();
//    }

//    @Bean
//    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public TestObj session(){
//        return new TestObj();
//    }

//    @Bean
//    @ApplicationScope
//    public TestObj applocationScopeBeen() {
//        return new TestObj();
//    }
//    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public TestObj sessionScopedBean() {
//        return new TestObj();
//    }
//    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public TestObj requestScopedBean() {
//        return new TestObj();
//    }

}
