package com.proj.todaysjjigae.service

import com.proj.todaysjjigae.dto.JjigaeDTO
import com.proj.todaysjjigae.mapper.JjigaeMapper
import com.proj.todaysjjigae.repository.JjigaeRepository
import com.proj.todaysjjigae.utils.exceptions.JjigaeException
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

    override fun getMovies(): List<JjigaeDTO> {
        val jjigae = jjigaeRepository.getAllJjigae()

        if(jjigae.isEmpty())
            throw JjigaeException("List of Jjigae is empty")

        //List<Jjigae> => List<JjigaeDTO>
        return jjigae.map {
            jjigaeMapper.fromEntity(it)
        }
    }
}