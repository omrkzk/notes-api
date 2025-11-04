package com.omrkzk.notes_api.controller;


import com.omrkzk.notes_api.model.Note;
import com.omrkzk.notes_api.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.save(note);
    }

    @DeleteMapping("/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteService.delete(id);
        return "Note deleted." + id;
    }

    @GetMapping
    public List<Note> getUserNotes(@RequestParam Long userId) {
        return noteService.getUserNotes(userId);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

}
