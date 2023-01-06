package ru.oktemsec.testspring.controller

import org.springframework.web.bind.annotation.*
import ru.oktemsec.testspring.model.Student
import ru.oktemsec.testspring.service.StudentService

@RestController
@RequestMapping("v1/students")
class StudentController {
    val studentService:StudentService = StudentService()

    @GetMapping(path = ["list"])
    fun list():List<Student> {
        return studentService.list()
    }

    @PostMapping(path = ["add"])
    fun add(@RequestBody student: Student) {
        studentService.add(student)
    }
}