package ru.oktemsec.testspring.dto

import java.time.LocalDate

data class StudentDto(
    val id: Int,
    val name: String,
    val dob: LocalDate
)
