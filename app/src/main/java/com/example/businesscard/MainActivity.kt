package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    GeneralDetails(
        title = stringResource(R.string.name),
        line = stringResource(R.string.job_line)
    )
    ContactDetails(
        mobileNumber = stringResource(R.string.mobile_number),
        username = stringResource(R.string.username),
        emailid = stringResource(R.string.email)
    )
}

@Composable
fun GeneralDetails(
    title: String,
    line: String
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.padding(top = 125.dp))
        Box(modifier = Modifier.size(150.dp)){
            Image(
                painterResource(id = R.drawable._0230630_141612_2),
                contentDescription = "Shreyas",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
    Text(

        modifier = Modifier
            .padding(top = 280.dp),
        text = title,
        fontSize = 70.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
    Text(
        text = line,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(top = 360.dp),
    )
}

@Composable
fun ContactDetails(
    mobileNumber: String,
    username: String,
    emailid: String,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(
            bottom = 50.dp,
            start = 70.dp
        )
    ){
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_phone_24),
                contentDescription = "Phone Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = mobileNumber,
                fontSize = 20.sp
            )
        }
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_add_link_24),
                contentDescription = "Connection Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = username,
                fontSize = 20.sp
            )
        }
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_attach_email_24),
                contentDescription = "Email Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = emailid,
                fontSize = 20.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}