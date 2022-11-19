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

    //찌개 추가하기
    override fun createJjigae(jjigaeDTO: JjigaeDTO): JjigaeDTO {

        if(jjigaeDTO.id != -1)
            throw IllegalArgumentException("Id must be null")

        val movie = jjigaeRepository.save(jjigaeMapper.toEntity(jjigaeDTO))
        return jjigaeMapper.fromEntity(movie)
    }
    //모든 찌개 리스트 가져오기
    override fun getJjigaes(): List<JjigaeDTO> {
        val jjigae = jjigaeRepository.getAllJjigae()

        if(jjigae.isEmpty())
            throw JjigaeException("List of Jjigae is empty")

        //List<Jjigae> => List<JjigaeDTO>
        return jjigae.map {
            jjigaeMapper.fromEntity(it)
        }
    }
    //지정 찌개정보 가져오기
    override fun getJjigae(id: Int): JjigaeDTO {
        val optionalJjigae = jjigaeRepository.findById(id)
        val jjigae = optionalJjigae.orElseThrow{JjigaeException("Jjigae with id $id is not present")}
        return jjigaeMapper.fromEntity(jjigae)
    }

    override fun updateJjigae(jjigaeDTO: JjigaeDTO): JjigaeDTO {
        val exists = jjigaeRepository.existsById(jjigaeDTO.id)
        val default = "Default value"

        if(!exists)
            throw JjigaeException("Jjigae with id ${jjigaeDTO.id} id not present")

        if(jjigaeDTO.preference == 0.0 || jjigaeDTO.imgPath ==default || jjigaeDTO.name ==default || jjigaeDTO.description ==default)
            throw JjigaeException("Complete JJIGAE object")

        jjigaeRepository.save(jjigaeMapper.toEntity(jjigaeDTO))
        return jjigaeDTO
    }
}