package com.proj.todaysjjigae.mapper

import com.proj.todaysjjigae.dto.JjigaeDTO
import com.proj.todaysjjigae.entity.Jjigae
import org.springframework.stereotype.Service

@Service
class JjigaeMapper : Mapper<JjigaeDTO, Jjigae> {

    override fun fromEntity(entity: Jjigae): JjigaeDTO = JjigaeDTO(
        entity.id,
        entity.name,
        entity.imgPath,
        entity.description,
        entity.preference
    )

    override fun toEntity(domain: JjigaeDTO): Jjigae = Jjigae(
        domain.id,
        domain.name,
        domain.imgPath,
        domain.description,
        domain.preference
    )
}