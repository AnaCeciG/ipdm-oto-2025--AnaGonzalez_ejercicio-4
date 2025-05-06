package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFEFEF)
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA995CB)), // color de fondo claro como en la imagen
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Perfil()
            Spacer(modifier = Modifier.height(250.dp))
            Contacto()
        }
    }
}

@Composable
fun Perfil() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.LightGray)
        )
        Text(
            text = "Ana González",
            fontSize = 36.sp,
            color = Color(0xFFF8F8F8),
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
        )
        Text(
            text = "Desarrolladora de Android Extraordinaria",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic,
            color = Color(0xFFF8F8F8),
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun Contacto() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        ContactoRow(icon = Icons.Default.Phone, contactoText = "+595 981 681 841")
        ContactoRow(icon = Icons.Default.Share, contactoText = "@ana.dev")
        ContactoRow(icon = Icons.Default.Email, contactoText = "chechi0314@gmail.com")
    }
}

@Composable
fun ContactoRow(icon: ImageVector, contactoText: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(vertical = 4.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF590069)
        )
        Spacer(modifier = Modifier.width(18.dp))
        Text(
            text = contactoText,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            color = Color(0xFFF8F8F8)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TarjetaPresentacionPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}