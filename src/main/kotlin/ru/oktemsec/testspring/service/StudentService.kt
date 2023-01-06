package ru.oktemsec.testspring.service

import org.springframework.stereotype.Service
import ru.oktemsec.testspring.model.Student
import java.time.LocalDate
import java.time.Month

@Service
class StudentService {
    fun list():List<Student> {
        return listOf (
            Student(name = "Alex", dob = LocalDate.of(2000, Month.JANUARY, 1)),
            Student(name = "Tom", dob = LocalDate.of(2002, Month.MARCH, 6))
        )
    }

    fun add(student: Student) {
        println(student)
    }
}