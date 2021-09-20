package com.akshatsahijpal.fullstackkotlin.remote

import android.service.autofill.UserData
import retrofit2.http.GET

interface CustomApi {
    @GET("/profile")
    suspend fun getUser() : com.akshatsahijpal.fullstackkotlin.data.UserData

    @GET("/all")
    suspend fun getAllUser(): List<com.akshatsahijpal.fullstackkotlin.data.UserData>
}