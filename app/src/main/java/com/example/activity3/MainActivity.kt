package com.example.activity3

import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity3.ui.theme.Activity3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activity3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            text = "REZA RISWANDHA",
            fontSize = 30.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp)
            )

        Spacer(modifier = Modifier.padding(13.dp))

        BoxScreen()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(13.dp))

    }
}

@Composable
fun Atribut(){
    Column {
        Row {

        }
    }

}


@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold
    )

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.location),
            contentDescription = "",
            modifier = Modifier.size(35.dp)
        )

        Spacer(
            modifier = Modifier.padding(3.dp)
        )

        Text(
            text = "Yogyakarta",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.padding(13.dp))

    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewah Yogyakarta",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        color = Color.Gray
        )

}



@Composable
fun BoxScreen(){
    Box(
        Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray)
            .fillMaxWidth()
    ){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        var img = painterResource(id = R.drawable.background)

        Image(
            painter = img,
            contentDescription = "weather",
            modifier = Modifier.size(150.dp)
        )

        Text(
            text = "Rain",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(13.dp)
        )
    }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activity3Theme {
        HomeScreen()
    }
}