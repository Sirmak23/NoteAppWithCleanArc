package com.irmak.cleanarcsampleproject.feature_note.data.repository

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.data.data_source.NoteDao
import com.irmak.cleanarcsampleproject.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao:NoteDao
):NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}
// eğer api dan da veri alsaydık bunlar biraz daha karmaşıklaşacaktı burada sadece databse den veri geliyor