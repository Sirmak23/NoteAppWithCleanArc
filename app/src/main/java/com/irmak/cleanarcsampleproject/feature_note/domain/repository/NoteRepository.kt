package com.irmak.cleanarcsampleproject.feature_note.domain.repository

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id:Int):Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}