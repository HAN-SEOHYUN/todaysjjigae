package com.proj.todaysjjigae.service

import com.proj.todaysjjigae.dto.JjigaeDTO

interface JjigaeService {
    fun createJjigae(jjigaeDTO: JjigaeDTO) : JjigaeDTO

}