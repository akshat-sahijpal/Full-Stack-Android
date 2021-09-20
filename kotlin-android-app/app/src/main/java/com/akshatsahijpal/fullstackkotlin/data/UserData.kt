package com.akshatsahijpal.fullstackkotlin.data

import dagger.multibindings.StringKey

data class UserData(
    var userName:String,
    var dateOfJoining: String,
    var imageURL: String
)