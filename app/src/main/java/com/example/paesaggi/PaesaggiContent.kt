package com.example.paesaggi

import android.graphics.drawable.shapes.Shape
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.tiles.LayoutElementBuilders.FontWeight
import com.example.paesaggi.data.Datasource
import com.example.paesaggi.model.Paesaggi
import com.example.paesaggi.ui.theme.Shapes
import kotlinx.coroutines.delay

@Composable
fun PaesaggiList(modifier: Modifier = Modifier) {
    LazyColumn {
        items(Datasource.loadPaesaggi) { paesaggi ->
            PaesaggiCard(paesaggi)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PaesaggiCard(paesaggi: Paesaggi, modifier: Modifier = Modifier) {

    var expandState by remember { mutableStateOf(false)}
    Card(modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = tween(
                delayMillis = 300,
                easing = LinearOutSlowInEasing
            )
        )
        .padding(8.dp),
        onClick = { expandState=!expandState },
        elevation = 4.dp,
        shape = Shapes.medium,
    ){
        Column {
            Image(
                painter = painterResource(paesaggi.Image),
                contentDescription = stringResource(paesaggi.Title),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop,

            )
            Text(
                text = LocalContext.current.getString(paesaggi.Title),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6,
            )
            if (expandState){
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = paesaggi.Description,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Normal,
                    style = MaterialTheme.typography.h6,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
