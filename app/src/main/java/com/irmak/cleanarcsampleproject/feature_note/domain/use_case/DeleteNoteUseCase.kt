package com.irmak.cleanarcsampleproject.feature_note.domain.use_case

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}