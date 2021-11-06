package com.example.srijan20app.data

import com.example.srijan20app.R
import com.example.srijan20app.model.SampleSrijanApp

class Datasource {

    fun loadSrijanApp(): List<SampleSrijanApp> {
        return listOf<SampleSrijanApp>(
            SampleSrijanApp(R.string.Event1, R.string.Time1, R.drawable.event1),
            SampleSrijanApp(R.string.Event2, R.string.Time2, R.drawable.event2),
            SampleSrijanApp(R.string.Event3, R.string.Time3, R.drawable.event3),
            SampleSrijanApp(R.string.Event4, R.string.Time4, R.drawable.event4),
            SampleSrijanApp(R.string.Event5, R.string.Time5, R.drawable.event6),
            SampleSrijanApp(R.string.Event6, R.string.Time6, R.drawable.event1),
            SampleSrijanApp(R.string.Event7, R.string.Time7, R.drawable.event7),
            SampleSrijanApp(R.string.Event8, R.string.Time8, R.drawable.event8),
            SampleSrijanApp(R.string.Event9, R.string.Time9, R.drawable.event9),
            SampleSrijanApp(R.string.Event10, R.string.Time10, R.drawable.dice)
        )
    }
}