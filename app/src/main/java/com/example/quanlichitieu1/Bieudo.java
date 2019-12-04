package com.example.quanlichitieu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Bieudo extends AppCompatActivity {
    float rainfall[]={98.8f,43.4f,22.2f};
    String chiteu[]={"Đồ ăn","Thể thao","Giải trí"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bieudo);
        setupPieChart();
    }

    private void setupPieChart() {
        List<PieEntry> pieEntries=new ArrayList<>();
        for (int i=0;i<rainfall.length;i++){
            pieEntries.add(new PieEntry(rainfall[i],chiteu[i]));
        }
        PieDataSet dataSet=new PieDataSet(pieEntries,"Biểu đồ chi tiêu");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data=new PieData(dataSet);

        PieChart chart=(PieChart) findViewById(R.id.chart);
        chart.setData(data);
        chart.animateY(1000);
        chart.invalidate();
    }
}
