package m12TAk3r.vocabularychecking.controller

import m12TAk3r.vocabularychecking.`object`.Vocabulary
import m12TAk3r.vocabularychecking.service.VocabularyService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class VocabularyController(
    val vocabularyService: VocabularyService
) {
    @GetMapping("/vocabulary-stores/{id}/vocabularies")
    fun getVocabulariesByStoreId(@PathVariable id: Long): ResponseEntity<List<Vocabulary>> {
        var vocabularies = vocabularyService.findVocabulariesByStoreId(id)
        return ResponseEntity.ok(vocabularies)
    }
}