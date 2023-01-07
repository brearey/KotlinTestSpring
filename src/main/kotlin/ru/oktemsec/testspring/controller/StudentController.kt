package ru.oktemsec.testspring.controller

import org.springframework.web.bind.annotation.*
import ru.oktemsec.testspring.dto.StudentDto
import ru.oktemsec.testspring.service.StudentService

@RestController
@RequestMapping("v1/students")
class StudentController(private val studentService: StudentService) {

    @GetMapping(path = ["list"])
    fun list():List<StudentDto> {
        return studentService.list()
    }

//    @PostMapping(path = ["add"])
//    fun add(@RequestBody studentDto: StudentDto) {
//        studentService.add(studentDto)
//    }
}