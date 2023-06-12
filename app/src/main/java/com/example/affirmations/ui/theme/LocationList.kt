package com.example.affirmations.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.affirmations.R
import com.example.affirmations.data.Location

@Composable
fun LocationList(locations: List<Location>) {
    LazyColumn {
        items(locations) { location ->
            LocationItem(location = location)
        }
    }
}


@Composable
fun LocationItem(location: Location) {
    val currentPhotoIndex = remember { mutableStateOf(0) }
    val currentPhotoUrl = location.photos[currentPhotoIndex.value]

    Column(modifier = Modifier.padding(bottom = 16.dp)) {
        Text(text = location.name)
        Button(
            onClick = {
                currentPhotoIndex.value = (currentPhotoIndex.value + 1) % location.photos.size
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = stringResource(R.string.next_photo))
        }
        Image(
            painter = painterResource(currentPhotoUrl),
            contentDescription = "Location Photo",
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                currentPhotoIndex.value =
                    (currentPhotoIndex.value - 1 + location.photos.size) % location.photos.size
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = stringResource(R.string.previous_photo))
        }
    }
}

