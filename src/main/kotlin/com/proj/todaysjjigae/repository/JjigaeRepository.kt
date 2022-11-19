package com.proj.todaysjjigae.repository

import com.proj.todaysjjigae.entity.Jjigae
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface JjigaeRepository : CrudRepository<Jjigae,Int> {
    @Query("SELECT m FROM Jjigae AS m")
    fun getAllJjigae():List<Jjigae>

}