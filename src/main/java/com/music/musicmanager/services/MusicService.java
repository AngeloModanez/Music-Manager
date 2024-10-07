package com.music.musicmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.musicmanager.entities.Music;
import com.music.musicmanager.repositories.MusicRepository;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music> getMusics() {
        return repository.findAll();
    }
}
