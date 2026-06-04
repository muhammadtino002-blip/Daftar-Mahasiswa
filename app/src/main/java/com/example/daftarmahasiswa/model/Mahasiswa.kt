package com.example.daftarmahasiswa.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Mahasiswa(
    @StringRes val nameResouceId: Int,
    @DrawableRes val imageResouceId: Int
)
