package com.music.musicmanager.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.music.musicmanager.entities.Music;
import com.music.musicmanager.services.MusicService;

@RestController
public class MusicController {

    @Autowired
    private MusicService service;

    @GetMapping("musics")
    public List<Music> getMusics() {
        return service.getMusics();
    }

    @GetMapping("musics/{id}")
    public Music getMusicById(@PathVariable int id) {
        return service.getMusicById(id);
    }
}