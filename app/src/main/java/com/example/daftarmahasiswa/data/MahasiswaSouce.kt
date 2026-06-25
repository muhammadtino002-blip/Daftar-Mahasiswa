package com.example.daftarmahasiswa.data

import com.example.daftarmahasiswa.R
import com.example.daftarmahasiswa.model.Mahasiswa

class MahasiswaSouce {
    fun loadMahasiswa() : List<Mahasiswa> {
        return listOf<Mahasiswa> (
            Mahasiswa(R.string.Joko, R.drawable.mahasiswa1, R.string.email_joko),
            Mahasiswa(R.string.Wulan, R.drawable.mahasiswa2, R.string.email_wulan),
            Mahasiswa(R.string.Anwar, R.drawable.mahasiswa3, R.string.email_anwar)
        )
    }
}