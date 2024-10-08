package com.music.musicmanager.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

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

    @PostMapping("musics")
    public Music postMusic(@RequestBody Music music) {
        return service.postMusics(music);
    }

    @DeleteMapping("musics/{id}")
    public void deleteMusicById(@PathVariable int id) {
        service.deleteMusicById(id);
    }

    @PutMapping("musics/{id}")
    public void updateMusic(@PathVariable int id, @RequestBody Music music) {
        service.updateMusic(id, music);
    }
}