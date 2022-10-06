package com.example.paesaggi
import android.provider.ContactsContract.Data
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paesaggi.data.Datasource
import com.example.paesaggi.ui.theme.PaesaggiTheme
import kotlinx.coroutines.launch
import kotlin.math.round

@Composable
fun PaesaggiApp() {
  Scaffold (
      topBar = { TopBar() },
      bottomBar = {
          BottomNavigationWithSelected()
      }
          ){
      PaesaggiList()
  }
}

@Composable
fun TopBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1,
            fontSize = 30.sp,
            modifier = Modifier.width(450.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun BottomNavigationWithSelected() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "Search", "About")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Search, Icons.Filled.Person)

    BottomNavigation (
        modifier = Modifier
            .graphicsLayer {
                shape = RoundedCornerShape(topStart = 400.dp, topEnd = 400.dp)
                clip = true
            }
    ){
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colors.primary,
                        shape = RoundedCornerShape(topStart = 700.dp, topEnd = 700.dp
                        )
                    ),
                icon = { Icon(icons[index], contentDescription = item) },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                alwaysShowLabel = false,
            )
        }
    }
}
