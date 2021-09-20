package com.example.data

import kotlinx.serialization.Serializable
@Serializable
data class DataModel(
    var name: String,
    var time: String,
    var imageURL: String
)
