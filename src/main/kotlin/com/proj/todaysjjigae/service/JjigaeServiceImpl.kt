package com.proj.todaysjjigae.service

import com.proj.todaysjjigae.dto.JjigaeDTO
import com.proj.todaysjjigae.mapper.JjigaeMapper
import com.proj.todaysjjigae.repository.JjigaeRepository
import org.springframework.stereotype.Service

@Service
class JjigaeServiceImpl(
    private val jjigaeRepository: JjigaeRepository,
    private val jjigaeMapper: JjigaeMapper
) : JjigaeService {
    override fun createJjigae(jjigaeDTO: JjigaeDTO): JjigaeDTO {

        if(jjigaeDTO.id != -1)
            throw IllegalArgumentException("Id must be null")

        val movie = jjigaeRepository.save(jjigaeMapper.toEntity(jjigaeDTO))
        return jjigaeMapper.fromEntity(movie)
    }
}