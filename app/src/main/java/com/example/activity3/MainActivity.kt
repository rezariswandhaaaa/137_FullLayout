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
import androidx.compose.ui.platform.InspectableModifier
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

        Atribut()

    }
}

@Composable
fun Atribut(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.LightGray)
            .fillMaxWidth()
    ){

        Spacer(modifier = Modifier.padding(10.dp))

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){
                Text(
                    text = "Humidity",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 30.dp)
                )
                Text(
                    text = "UV Index",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 25.dp)
                )
            }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){
                Text(
                    text = "98%",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 50.dp)
                )
                Text(
                    text = "9/10",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(end = 40.dp)
                )
            }


        Spacer(modifier = Modifier.padding(13.dp))


        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){
                Text(
                    text = "Sunrise",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 35.dp)
                )
                Text(
                    text = "Sunset",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 35.dp)
                )
            }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){
                Text(
                    text = "05.00 AM",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp)
                )
                Text(
                    text = "05.40 AM",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(end = 15.dp)
                )
            }

        Spacer(modifier = Modifier.padding(20.dp))

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