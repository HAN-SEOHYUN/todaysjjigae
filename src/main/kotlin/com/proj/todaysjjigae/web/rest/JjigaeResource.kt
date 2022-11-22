package com.proj.todaysjjigae.web.rest

import com.proj.todaysjjigae.dto.JjigaeDTO
import com.proj.todaysjjigae.service.JjigaeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping("/api")
class JjigaeResource(
    private val jjigaeService: JjigaeService
) {
    //등록
    @PostMapping("/jjigae")
    fun createJjigae(@RequestBody jjigaeDTO: JjigaeDTO) : JjigaeDTO{
        return jjigaeService.createJjigae(jjigaeDTO)
    }
    //GET 모든 목록
    @GetMapping("/jjigaes")
    fun getJjigaes(): ResponseEntity<List<JjigaeDTO>> =
        ResponseEntity.ok(jjigaeService.getJjigaes())
    //GET ID Object
    @GetMapping("/jjigae/{id}/")
    fun getJjigae(@PathVariable id:Int) =
        ResponseEntity.ok(jjigaeService.getJjigae(id))
    //수정
    @PutMapping("/jjigae")
    fun updateJjigae(@RequestBody jjigaeDTO: JjigaeDTO) : JjigaeDTO{
        return jjigaeService.updateJjigae(jjigaeDTO)
    }
    //DELETE BY ID
    @DeleteMapping("/jjigae/{id}/")
    fun deleteJjigae(@PathVariable id:Int) =
        ResponseEntity(jjigaeService.deleteJjigae(id), HttpStatus.NO_CONTENT)
    //GET Random Object
    @GetMapping("/random")
    fun getRandomJjigae() =
        ResponseEntity.ok(jjigaeService.getRandomJjigae())
}