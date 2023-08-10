package com.irmak.cleanarcsampleproject.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDataBase:RoomDatabase() {
    abstract val noteDao:NoteDao
    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}