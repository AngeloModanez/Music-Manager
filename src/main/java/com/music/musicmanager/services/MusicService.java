package com.music.musicmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.musicmanager.repositories.MusicRepository;

@Service
public class MusicService {

    @Autowired
    private MusicRepository repository;

}
