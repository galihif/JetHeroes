package com.giftech.jetheroes.data

import com.giftech.jetheroes.model.Hero
import com.giftech.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}