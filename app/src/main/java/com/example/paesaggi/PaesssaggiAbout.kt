package com.example.paesaggi

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paesaggi.data.Datasource
import com.example.paesaggi.model.About
import com.example.paesaggi.ui.theme.Shapes


@Composable
fun AboutList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
        items(Datasource.loadAbout) { about ->
            AboutMe(about)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AboutMe(about: About, modifier: Modifier = Modifier) {
    var expandState by remember { mutableStateOf(false) }
    Card(modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
        .padding(20.dp),
        onClick = { expandState=!expandState },
        elevation = 4.dp,
        shape = Shapes.medium,
    ) {

    Column() {
        Row() {
        Image(
            painter = painterResource(id = about.Img),
            contentDescription = null,
            Modifier.requiredSize(80.dp)
        )
        Text(
            text = LocalContext.current.getString(about.Name),
            modifier = Modifier.padding(20.dp),
            style = MaterialTheme.typography.h6,
            textAlign = TextAlign.Center,
        )
    }
    if (expandState){
        Text(
            modifier = Modifier.padding(16.dp),
            text = about.AboutText,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Normal,
            style = MaterialTheme.typography.h6,
            textAlign = TextAlign.Start,
            maxLines = 4,
            overflow = TextOverflow.Ellipsis
            ) }
        }
    }
}

