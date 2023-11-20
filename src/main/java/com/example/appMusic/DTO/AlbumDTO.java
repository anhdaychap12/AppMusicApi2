package com.example.appMusic.DTO;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public record AlbumDTO(
        Integer id,
        String title,
        Date releaseDate,
        Time duration,
        String nameArtist,
        String avatar,
        List<String> listSong
) {
}
