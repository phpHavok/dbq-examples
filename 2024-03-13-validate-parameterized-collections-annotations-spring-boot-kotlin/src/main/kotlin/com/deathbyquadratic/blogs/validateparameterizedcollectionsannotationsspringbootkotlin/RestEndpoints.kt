package com.deathbyquadratic.blogs.validateparameterizedcollectionsannotationsspringbootkotlin

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Person(
    @field:NotBlank
    val name: String,
    @field:NotEmpty
    val namesOfChildren: List<@NotBlank String>
)

@RestController
class RestEndpoints {
    @PostMapping
    fun createPerson(@Valid @RequestBody person: Person) =
        ResponseEntity.ok("Person created successfully!")
}
