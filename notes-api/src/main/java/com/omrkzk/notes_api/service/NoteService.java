package com.omrkzk.notes_api.service;

import com.omrkzk.notes_api.model.Note;
import com.omrkzk.notes_api.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void delete(Long id) {
        noteRepository.deleteById(id);
    }

    public List<Note> getUserNotes(Long userId) {
        return noteRepository.findByUser_UserId(userId);
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }
}
