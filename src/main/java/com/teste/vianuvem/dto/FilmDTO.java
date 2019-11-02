package com.teste.vianuvem.dto;

import com.teste.vianuvem.model.Film;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FilmDTO {

    private Long episodeId;
    private String title;
    private String director;
    private LocalDateTime created;
    private String producer;
    private List<StarshipDTO> starshipList;
    private String url;
    private List<String> starships;


    public static FilmDTO parseToFilmDTO(Film film){
        FilmDTO filmDTO =null;
        if(film != null) {
            filmDTO = new FilmDTO();
            BeanUtils.copyProperties(filmDTO, film);
        }
        return filmDTO;

    }



}