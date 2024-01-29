package com.example.myapplication

import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                screen1()
                }
            }
        }
    }
}
@Composable
fun GreetingText(name:String, from:String, modifier:Modifier = Modifier){


    Column(verticalArrangement = Arrangement.Center, modifier = modifier.padding(8.dp))
    {
        Text(
            text = "Happy Birthday $name!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "from $from",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun screen1(modifier:Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(align = Alignment.Center)){
    var gamesCount by remember {mutableStateOf(0)}
    var currScreen by remember {mutableStateOf(1)}
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        if (currScreen == 1) {
            var ImageID = R.drawable.orange_tree

            Image(
                painter = painterResource(ImageID),
                contentDescription = "orange"
            )

            Spacer(modifier = Modifier.height(60.dp))
            Text(text = "Games count: $gamesCount")
            Button(onClick = {
                currScreen = 2
            }) {
            }
        }
            else if (currScreen == 2) {
                var ImageID = R.drawable.orange_fruit
                Image(
                    painter = painterResource(ImageID),
                    contentDescription = "orange"
                )

                Spacer(modifier = Modifier.height(60.dp))
                Text(text = "Games count: $gamesCount")
                var req = (5..10).random()
                var clickCount by remember {mutableStateOf(0)}
                Button(onClick = {
                    clickCount = clickCount + 1
                }) {
                }
                Text(text = "required clicks: $req")
                Text(text = "clicks: $clickCount")
                if (clickCount >= req){
                    currScreen = 3
                    clickCount = 0
                }
            }
            else if (currScreen == 3) {
                var ImageID = R.drawable.orange_drink_full
                Image(
                    painter = painterResource(ImageID),
                    contentDescription = "orange"
                )

                Spacer(modifier = Modifier.height(60.dp))
                Text(text = "Games count: $gamesCount")
                Button(onClick = {
                    currScreen = 4
                }) {
                }
            }
            else if (currScreen == 4) {
                var ImageID = R.drawable.orange_drink_empty
                Image(
                    painter = painterResource(ImageID),
                    contentDescription = "orange"
                )

                Spacer(modifier = Modifier.height(60.dp))
                Text(text = "Games count: $gamesCount")
            }
            /*
        when(result)
        {
            1-> R.drawable.orange_drink_empty
            2-> R.drawable.orange_drink_full
            3-> R.drawable.orange_fruit
            else-> R.drawable.orange_tree
        }

         */

            /*
        Button(onClick = {
            result = (1..6).random()
        }) {

         */
        }

}




