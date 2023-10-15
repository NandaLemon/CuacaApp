package com.example.cuaca

import android.os.Bundle
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuaca.ui.theme.CuacaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuacaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   HalamanUtama(name = "Nandut", from ="Jogja" )

                }
            }
        }
    }
}
@Composable
fun HalamanUtama(name: String,from: String,modifier: Modifier=Modifier){
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier
           .fillMaxSize()
           .padding(20.dp)

   ) {
    Text(text = "Nandut Pradut",
        fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
       Spacer(modifier = Modifier .padding(13.dp))
       Box1()
       Spacer(modifier = Modifier .padding(13.dp))
       LocnTemp()
       Spacer(modifier = Modifier .padding(13.dp))
       Box3()


   }

}
@Composable
fun Box1(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)){
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.cuaca), contentDescription = null,
                    modifier = Modifier.size(200.dp))
                Text(text = "Klebus", color = Color.Black, fontWeight = FontWeight.Bold)
        }

    }
}
@Composable
fun LocnTemp(){
    Text(text = "23'C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row (verticalAlignment = Alignment.CenterVertically){
    Image(painter = painterResource(id = R.drawable.baseline_location_on_24), contentDescription =null )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
    Spacer(modifier = Modifier.padding(13.dp))
    Text(text = "Kasihan,Bantul,Daerah Istimewa Yogyakarta",
        fontSize = 14.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold)
}

@Composable
fun Box3(){
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan)
    ){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    Text(text = "Humidity", fontSize = 18.sp, textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Text(text = "98%",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp)
    )

    }

    Spacer(modifier = Modifier.weight(1f))

    Column (
        modifier = Modifier
            .padding(10.dp)
            .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
    Text(text = "UV Index",
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Text(text = "9/10",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    }
    }
    Spacer(modifier = Modifier.height(16.dp))

    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
    Text(text = "Sunrise",
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Text(text = "05.30 AM",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    }
    Spacer(modifier = Modifier.weight(1f))

    Column(modifier = Modifier
        .padding(10.dp)
        .weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
    Text(text = "Sunset",
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Text(text = "05.10 PM",
        fontSize =20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth())

    }
    }
    }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuacaTheme {
        HalamanUtama(name = "WEATHER APP", from ="Jogja" )
    }

}