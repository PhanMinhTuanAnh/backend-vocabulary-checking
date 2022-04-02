package m12TAk3r.vocabularychecking.repository

import m12TAk3r.vocabularychecking.`object`.Vocabulary
import org.springframework.stereotype.Repository

@Repository
class VocabularyRepository {
    var vocabularyStores = listOf(
        Vocabulary(1, "Bodyguard", "Vệ sĩ", 1),
        Vocabulary(2, "Judge", "Quan tòa", 1),
        Vocabulary(3, "Detective", "Thám tử", 1),
        Vocabulary(4, "本", "Sách", 2),
        Vocabulary(5, "薬", "Thuốc", 2),
        Vocabulary(6, "犬", "Chó", 2)
    )

    fun findVocabulariesByStoreId(vocabularyStoreId: Long) = vocabularyStores.filter { vocabulary ->
        vocabulary.vocabularyStoreId == vocabularyStoreId
    }
}