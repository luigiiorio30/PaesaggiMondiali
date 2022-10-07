package com.example.paesaggi.data

import android.media.audiofx.AudioEffect.Descriptor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.paesaggi.R
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
}
