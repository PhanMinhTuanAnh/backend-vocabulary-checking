package m12TAk3r.vocabularychecking.service

import m12TAk3r.vocabularychecking.repository.VocabularyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VocabularyService(
    @Autowired
    private val vocabularyRepository: VocabularyRepository
) {
    fun findVocabulariesByStoreId(vocabularyStoreId: Long) = vocabularyRepository.findVocabulariesByStoreId(
        vocabularyStoreId
    )
}