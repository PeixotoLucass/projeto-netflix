package com.projetonetflix.projetonetflix.dto;

import com.projetonetflix.projetonetflix.model.entity.TitleType;

public class TitleTypeDTO {

    private String name;

    public TitleTypeDTO() {
    }

    public TitleTypeDTO(TitleType titleType) {
        this.name = titleType.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
