package com.backend.test.backendtest.mapper;

import com.backend.test.backendtest.dto.IdeaDto;
import com.backend.test.backendtest.entity.Idea;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IdeaMapper extends EntityMapper<IdeaDto, Idea> {
}
