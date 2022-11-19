package com.proj.todaysjjigae.service

import com.proj.todaysjjigae.dto.JjigaeDTO

interface JjigaeService {
    fun createJjigae(jjigaeDTO: JjigaeDTO) : JjigaeDTO
    fun getJjigaes(): List<JjigaeDTO>
    fun getJjigae(id:Int) : JjigaeDTO
    fun updateJjigae(jjigaeDTO: JjigaeDTO) : JjigaeDTO
    fun deleteJjigae(id:Int)
}