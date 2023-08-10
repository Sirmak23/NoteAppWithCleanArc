package com.irmak.cleanarcsampleproject.di

import android.app.Application
import androidx.room.Room
import com.irmak.cleanarcsampleproject.feature_note.data.data_source.NoteDataBase
import com.irmak.cleanarcsampleproject.feature_note.data.repository.NoteRepositoryImpl
import com.irmak.cleanarcsampleproject.feature_note.domain.repository.NoteRepository
import com.irmak.cleanarcsampleproject.feature_note.domain.use_case.AddNote
import com.irmak.cleanarcsampleproject.feature_note.domain.use_case.DeleteNoteUseCase
import com.irmak.cleanarcsampleproject.feature_note.domain.use_case.GetNoteUseCase
import com.irmak.cleanarcsampleproject.feature_note.domain.use_case.GetNotesUseCase
import com.irmak.cleanarcsampleproject.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application):NoteDataBase{
        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            NoteDataBase.DATABASE_NAME
        ).build()
    }
    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDataBase):NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNote = AddNote(repository),
            getNote = GetNoteUseCase(repository)
        )
    }
}