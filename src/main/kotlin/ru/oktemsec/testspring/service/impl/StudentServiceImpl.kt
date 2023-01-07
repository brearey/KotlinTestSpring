package ru.oktemsec.testspring.service.impl

import org.springframework.stereotype.Service
import ru.oktemsec.testspring.dto.StudentDto
import ru.oktemsec.testspring.repository.StudentRepository
import ru.oktemsec.testspring.service.StudentService
import java.time.LocalDate

@Service
class StudentServiceImpl(): StudentService {
    override fun list(): List<StudentDto> {
        return listOf(
            StudentDto(id = 1, name = "jack", dob = LocalDate.now()),
            StudentDto(id = 2, name = "lina", dob = LocalDate.now()),
            StudentDto(id = 3, name = "artur", dob = LocalDate.now()),
            StudentDto(id = 4, name = "markel", dob = LocalDate.now()),
        )
//        return studentRepository.findAll().map {
//            StudentDto(
//                id = it.id,
//                name = it.name,
//                dob = it.dob,
//            )
//        }
    }

//    override fun add(studentDto: StudentDto) {
//        studentRepository.save(studentDto)
//    }
}