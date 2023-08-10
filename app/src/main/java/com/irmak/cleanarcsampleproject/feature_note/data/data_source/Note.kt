package com.irmak.cleanarcsampleproject.feature_note.data.data_source

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.irmak.cleanarcsampleproject.ui.theme.BabyBlue
import com.irmak.cleanarcsampleproject.ui.theme.LightGreen
import com.irmak.cleanarcsampleproject.ui.theme.RedOrange
import com.irmak.cleanarcsampleproject.ui.theme.RedPink
import com.irmak.cleanarcsampleproject.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }

}

class InvalidNoteException(message:String):Exception(message)
