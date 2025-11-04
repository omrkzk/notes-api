package com.omrkzk.notes_api.repository;

import com.omrkzk.notes_api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUser_UserId(Long userId);
}
