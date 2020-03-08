package com.dinazor.core.dto.abstracts;

import com.dinazor.core.entity.abstracts.SuperEntity;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class SuperDto<TDto extends SuperDto, TEntity extends SuperEntity> {

    @Getter
    @Setter
    private Long id;

    //@Autowired
    private ModelMapper modelMapper = new ModelMapper();

    private Class<TDto> dtoClass;
    private Class<TEntity> entityClass;

    public TDto convertToDto(TEntity source) {
        TDto dto = modelMapper.map(source, dtoClass);
        return dto;
    }

    public TEntity convertToEntity(TDto source) {
        TEntity entity = modelMapper.map(source, entityClass);
        return entity;
    }

    public void setDtoClass(Class<TDto> dtoClass) {
        this.dtoClass = dtoClass;
    }

    public void setEntityClass(Class<TEntity> entityClass) {
        this.entityClass = entityClass;
    }

}
