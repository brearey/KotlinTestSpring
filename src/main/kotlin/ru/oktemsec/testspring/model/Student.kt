package ru.oktemsec.testspring.model

import java.time.LocalDate

data class Student (val id: Long? = null, val name: String, val dob: LocalDate) {
    override fun toString(): String {
        return "Student {" +
                "id = $id," +
                "name = $name," +
                "Day of birth: $dob" +
                "}"
    }
}