package com.music.musicmanager.repositories;

import com.music.musicmanager.entities.Music;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Integer> {

}