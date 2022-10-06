package com.example.paesaggi
import android.content.ClipData.Item
import android.graphics.Paint.Align
import android.os.Bundle
import android.preference.PreferenceActivity.Header
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paesaggi.data.Datasource
import com.example.paesaggi.model.Paesaggi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.ModalDrawer
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.example.paesaggi.data.Datasource.loadPaesaggi
import com.example.paesaggi.ui.theme.PaesaggiTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaesaggiTheme(){
                PaesaggiApp()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PaesaggiCardPreview() {
    PaesaggiApp()
}