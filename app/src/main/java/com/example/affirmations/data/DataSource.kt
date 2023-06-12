/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R

data class Location(
    val name: String,
    val photos: List<Int>,
    val description: String,
    val imageResourceId: Int,
    val nextPhoto: Int
)

object DataSource {
    fun loadLocations(): List<Location> {
        return listOf(
            Location(
                name = "Che Hill",
                photos = listOf(
                    R.drawable.doiche1,
                    R.drawable.doiche2
                ),
                description = "Doi Che, Dalat City, Vietnam",
                imageResourceId = R.drawable.doiche1,
                nextPhoto = R.drawable.doiche2,
            ),
            Location(
                name = "Pilchuck Mt",
                photos = listOf(
                    R.drawable.pil2,
                    R.drawable.pil3
                ),
                description = "Pilchuck Mt, Granite Falls, WA",
                imageResourceId = R.drawable.pil3,
                nextPhoto = R.drawable.pil2,
            ),
            Location(
                name = "Seattle",
                photos = listOf(
                    R.drawable.sea1,
                    R.drawable.sea2
                ),
                description = "Seattle Downtown",
                imageResourceId = R.drawable.sea1,
                nextPhoto = R.drawable.sea2,
            ),
            Location(
                name = "Spirit Peaks Raceway",
                photos = listOf(
                    R.drawable.spr3,
                    R.drawable.spr5
                ),
                description = "Sideway! Brap brap brap!",
                imageResourceId = R.drawable.spr5,
                nextPhoto = R.drawable.spr3,
            )
        )
    }
}
