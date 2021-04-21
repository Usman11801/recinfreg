package com.example.recinfreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        pdfView=(PDFView) findViewById(R.id.pdfviewtest);
        pdfView.fromAsset("By_Mufti_Taqi_Usmani.pdf").load();

    }
}