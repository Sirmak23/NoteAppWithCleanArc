package com.irmak.cleanarcsampleproject.feature_note.presentation.notes

import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder):NotesEvent()
    data class DeleteNote(val note:Note):NotesEvent()
    object RestoreNote:NotesEvent()
    object ToggleOrderSection:NotesEvent()
}
