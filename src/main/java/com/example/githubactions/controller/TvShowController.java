package com.example.githubactions.controller;


import com.example.githubactions.entity.TvShow;
import com.example.githubactions.service.TvShowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tvshows")
public class TvShowController {

    private final TvShowService tvShowService;

    public TvShowController(TvShowService tvShowService) {
        this.tvShowService = tvShowService;
    }

    @GetMapping
    public List<TvShow> getAll() {
        return tvShowService.getAllTvShows();
    }
}