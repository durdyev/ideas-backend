package com.backend.test.backendtest.service;

import com.backend.test.backendtest.dto.IdeaDto;
import com.backend.test.backendtest.mapper.IdeaMapper;
import com.backend.test.backendtest.repo.IdeaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IdeaService {

    private final IdeaMapper ideaMapper;
    private final IdeaRepository ideaRepository;

    public List<IdeaDto> findAll() {
        return ideaMapper.toDto((List) ideaRepository.findAll());
    }

    public IdeaDto create(IdeaDto idea) {
        return ideaMapper.toDto(ideaRepository.save(ideaMapper.toEntity(idea)));
    }
}
