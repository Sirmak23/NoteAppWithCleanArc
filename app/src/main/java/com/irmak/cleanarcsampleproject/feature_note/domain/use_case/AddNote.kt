package com.irmak.cleanarcsampleproject.feature_note.domain.use_case

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.InvalidNoteException
import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.domain.repository.NoteRepository

class AddNote (
    private val repository: NoteRepository
        ){
    suspend operator fun invoke(note:Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("Not başlığı boş bırakılamaz.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("Not içeriği boş bırakılamaz.")
        }
        repository.insertNote(note)
    }
}