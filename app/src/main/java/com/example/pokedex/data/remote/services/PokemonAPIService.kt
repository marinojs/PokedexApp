package com.example.pokedex.data.remote.services

import com.example.pokedex.data.remote.model.PokemonDetailResponse
import com.example.pokedex.data.remote.model.PokemonListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPIService {

    @GET("{pokemonUrl}")
    suspend fun getPokemonByUrl(@Path("pokemonUrl") pokemonUrl: String): PokemonDetailResponse

    @GET("pokemon/?limit=-1")
    suspend fun getPokemons(): PokemonListResponse

}
