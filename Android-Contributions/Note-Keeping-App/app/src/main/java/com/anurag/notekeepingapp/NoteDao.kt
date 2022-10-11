package com.anurag.notekeepingapp

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: NoteEntity)

    @Delete
    suspend fun delete(note: NoteEntity)

    @Query("SELECT * FROM note_table ORDER BY note ASC")
    fun loadAllNotes(): Flow<List<NoteEntity>>
}