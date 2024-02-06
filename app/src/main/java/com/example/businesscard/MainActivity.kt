package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    GeneralDetails()
    ContactDetails(
        mobileNumber = stringResource(R.string.mobile_number),
        username = stringResource(R.string.username),
        emailid = stringResource(R.string.email)
    )
}

@Composable
fun GeneralDetails(){
    Column {
        Image(painter = , contentDescription = )
    }
}

@Composable
fun ContactDetails(
    mobileNumber: String,
    username: String,
    emailid: String,
    modifier: Modifier = Modifier
){
    Column {
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_phone_24),
                contentDescription = "Phone Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = mobileNumber
            )
        }
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_add_link_24),
                contentDescription = "Connection Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = username
            )
        }
        Row (modifier = Modifier.padding(10.dp)){
            Icon(painterResource(id = R.drawable.baseline_attach_email_24),
                contentDescription = "Email Icon",
                tint = Color(0xFF006E3A)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = emailid
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