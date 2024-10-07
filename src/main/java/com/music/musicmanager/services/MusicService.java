package com.music.musicmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.musicmanager.entities.Music;
import com.music.musicmanager.repositories.MusicRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music> getMusics() {
        return repository.findAll();
    }

    public Music getMusicById(int id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Música não cadastrada!!"));
    }

    public Music postMusics(Music music) {
        return repository.save(music);
    }

    public void deleteMusicById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Música não cadastrada!!");
        }
    }
}
