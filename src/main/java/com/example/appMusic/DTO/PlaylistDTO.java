package com.example.appMusic.DTO;

import java.util.List;

public record PlaylistDTO(
        Integer id,
        String name,
        String userName,
        List<String> listSong
) {
}
