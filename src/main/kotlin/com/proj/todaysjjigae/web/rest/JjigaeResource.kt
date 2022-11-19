package com.proj.todaysjjigae.web.rest

import com.proj.todaysjjigae.dto.JjigaeDTO
import com.proj.todaysjjigae.service.JjigaeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class JjigaeResource(
    private val jjigaeService: JjigaeService
) {

    @PostMapping
    fun createJjigae(@RequestBody jjigaeDTO: JjigaeDTO) : JjigaeDTO{
        return jjigaeService.createJjigae(jjigaeDTO)
    }

    @GetMapping
    fun getJjigae(): ResponseEntity<List<JjigaeDTO>> =
        ResponseEntity.ok(jjigaeService.getMovies())



}