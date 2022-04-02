package m12TAk3r.vocabularychecking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@CrossOrigin("*")
class VocabularyCheckingApplication

fun main(args: Array<String>) {
	runApplication<VocabularyCheckingApplication>(*args)
}
