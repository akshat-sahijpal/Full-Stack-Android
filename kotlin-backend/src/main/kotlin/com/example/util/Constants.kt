package com.example.util

import com.example.data.DataModel

object Constants {
    var port = 8080
    var localURL = "http://localhost:$port"
    var emulatorURL = "https://10.0.2.2:$port"
        var phoneURL = "http://192.168.43.90:$port"
    var phone = "192.168.43.90"
    var data = listOf(DataModel("akshat", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/coverPicture.jpg"),
        DataModel("profiler", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/default_profile_picture.png"),
        DataModel("demoer", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/demo_app_invoke_b7b00ee0fa.png"),
        DataModel("docker", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/golangDocker.png"),
        DataModel("integration", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/IntegrationOverview._CB660501564_.png"),
        DataModel("amazon", System.currentTimeMillis().toString(), "${com.example.util.Constants.phoneURL}/img/IntroToAmazonPay._CB1565018491_.png"),
    )
}