package m12TAk3r.vocabularychecking.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    fun helloWorld(): ResponseEntity<Word> {
        var word = Word(1, 2)
        return ResponseEntity.ok(word)
    }
}

data class Word(
    val a: Int,
    val b: Int
)