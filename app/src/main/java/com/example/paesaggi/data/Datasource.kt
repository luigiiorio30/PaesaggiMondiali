package com.example.paesaggi.data

import com.example.paesaggi.R
import com.example.paesaggi.model.About
import com.example.paesaggi.model.Paesaggi
import com.example.paesaggi.model.Screen

object Datasource {

    val loadScreen = listOf<Screen>(
        Screen(
            TitleWindow = R.string.app_name
        ),
        Screen(
            TitleWindow = R.string.search
        ),
        Screen(
            TitleWindow = R.string.about
        ),
    )

    val loadPaesaggi = listOf<Paesaggi>(
        Paesaggi(
            Title = R.string.paesaggio1,
            Image = R.drawable.paestum,
            Description= "Prova"
        ),

        Paesaggi(
            Title = R.string.paesaggio2,
            Image = R.drawable.amalfi,
            Description= "Prova"
        ),

        Paesaggi(
            Title = R.string.paesaggio3,
            Image = R.drawable.monferrato,
            Description= "Prova"
        ),

        Paesaggi(
            Title = R.string.paesaggio4,
            Image = R.drawable.canyon,
            Description= "Prova"
        ),

        Paesaggi(
            Title = R.string.paesaggio5,
            Image = R.drawable.vele,
            Description= "Prova"
        ),
    )

    val loadAbout = listOf<About>(
        About(
            Name = R.string.person1,
            Img = R.drawable.photo_2022_10_09_12_06_57,
            AboutText= "Prova"
        ),

        About(
            Name = R.string.person2,
            Img = R.drawable.photo_2022_10_09_12_06_57,
            AboutText= "Prova"
        ),
    )
}



