package ru.oktemsec.testspring.service

import ru.oktemsec.testspring.dto.StudentDto

interface StudentService {
    fun list():List<StudentDto>

//    fun add(studentDto: StudentDto)
}