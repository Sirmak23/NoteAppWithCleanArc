package com.irmak.cleanarcsampleproject.feature_note.domain.use_case

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id:Int):Note?{
        return repository.getNoteById(id)
    }
}