package com.eshwar.gactiongcp.controllers;

import com.eshwar.gactiongcp.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/films/")
public class FilmController {

    List<Film> films = new ArrayList<>();

    @GetMapping("/")
    public List<Film> getAllFilms(){
        return films;
    }

    @PostMapping(path = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean addFilm(@RequestBody Film film){
        try{
            films.add(film);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
}
