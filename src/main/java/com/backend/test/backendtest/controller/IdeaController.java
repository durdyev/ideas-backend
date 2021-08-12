package com.backend.test.backendtest.controller;

import com.backend.test.backendtest.dto.IdeaDto;
import com.backend.test.backendtest.service.IdeaService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/idea")
public class IdeaController {

    private final IdeaService ideaService;

    @GetMapping
    public List<IdeaDto> getIdeas() {
        return ideaService.findAll();
    }

    @PostMapping
    public IdeaDto createIdea(@RequestBody IdeaDto idea) {
        return ideaService.create(idea);
    }
}
