package com.irmak.cleanarcsampleproject.feature_note.presentation.notes


import com.irmak.cleanarcsampleproject.feature_note.data.data_source.Note
import com.irmak.cleanarcsampleproject.feature_note.domain.util.NoteOrder
import com.irmak.cleanarcsampleproject.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
