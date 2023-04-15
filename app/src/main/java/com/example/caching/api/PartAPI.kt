package com.example.caching.api

import com.example.caching.data.Part
import retrofit2.http.GET

interface PartAPI {
    companion object {
        const val BASE_URL = "https://script.google.com/macros/s/AKfycbyNEFs4fI9EIc9z5PwuDjqRO_BS9JdtIwF1T7ZKMiV7ZPcsjzCkfy8WMZXz2zYyT9JS/"
    }

    @GET("https://script.google.com/macros/s/AKfycbyNEFs4fI9EIc9z5PwuDjqRO_BS9JdtIwF1T7ZKMiV7ZPcsjzCkfy8WMZXz2zYyT9JS/exec")
    suspend fun getParts(): List<Part>
}