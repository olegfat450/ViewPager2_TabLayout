package com.example.viewpager2_tablayout

import java.io.Serializable

class Page (val name: String,val uri: String): Serializable {

    companion object{

        val p1 = Page("Кино","https://www.kino-teatr.ru")
        val p2 = Page("Музыка","https://music.yandex.ru")
        val p3 = Page("Новости","https://ria.ru")
        val p4 = Page("Авто","https://www.drom.ru")
        val p5 = Page("YouTube","https://www.youtube.com")
        val p6 = Page("Погода","https://www.gismeteo.ru")

        val list = listOf(p1,p2,p3,p4,p5,p6)
    }
}