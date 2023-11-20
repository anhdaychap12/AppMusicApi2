package com.example.appMusic.DTO;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public record SongDTO(
        Integer id,
        String title,
        Date releaseDate,
        Time duration,
        String avatar,
        String genre,
        String nameArtist,
        List<Integer> listPlaylist,
        List<String> listAlbum

) {
}
