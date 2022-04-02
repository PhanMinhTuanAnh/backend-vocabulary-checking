package m12TAk3r.vocabularychecking.controller

import m12TAk3r.vocabularychecking.`object`.VocabularyStore
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
class VocabularyStoreController {

    var vocabularyStores = listOf(
        VocabularyStore(1, "English"),
        VocabularyStore(2, "Japanese"),
        VocabularyStore(3, "Vietnamese")
    )

    @GetMapping("/vocabulary-stores")
    fun getVocabularyStores(): ResponseEntity<List<VocabularyStore>> {
        return ResponseEntity.ok(vocabularyStores)
    }

    @GetMapping("/vocabulary-stores/{id}")
    fun getVocabularyStoreById(@PathVariable("id") id: Long): ResponseEntity<VocabularyStore> {
        var vocabularyStore = vocabularyStores.filter { vocabularyStore ->
            vocabularyStore.id == id
        }[0]
        return ResponseEntity.ok(vocabularyStore)
    }
}

