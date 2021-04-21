package com.example.recinfreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfHadisActicity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_hadis_acticity);
        pdfView=(PDFView) findViewById(R.id.pdfviewtestt);
        pdfView.fromAsset("Bukhari.pdf").load();
    }
}