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
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.h1, R.string.honda_1, R.string.H_description_1),
    Dog(R.drawable.h2,R.string.honda_2, R.string.H_description_2),
    Dog(R.drawable.h3, R.string.honda_3, R.string.H_description_3),
    Dog(R.drawable.h4, R.string.honda_4, R.string.H_description_4),
    Dog(R.drawable.h5, R.string.honda_5, R.string.H_description_5),
    Dog(R.drawable.h6, R.string.honda_6, R.string.H_description_6),
    Dog(R.drawable.h7, R.string.honda_7,  R.string.H_description_7),
    Dog(R.drawable.h8, R.string.honda_8,  R.string.H_description_8),
    Dog(R.drawable.h9, R.string.honda_9, R.string.H_description_9)
)
