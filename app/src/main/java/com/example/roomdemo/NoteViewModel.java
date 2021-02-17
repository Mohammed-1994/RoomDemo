package com.example.roomdemo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {

    private NoteReposotory noteReposotory;
    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        noteReposotory = new NoteReposotory(application);
        allNotes = noteReposotory.getAllNotes();
    }


    public void insert(Note note) {
        noteReposotory.insert(note);
    }

    public void update(Note note) {
        noteReposotory.update(note);
    }

    public void delete(Note note) {
        noteReposotory.delete(note);
    }

    public void deleteAll() {
        noteReposotory.deleteAll();
    }

    public LiveData<List<Note>> getAllNotes() {
        return noteReposotory.getAllNotes();
    }
}
