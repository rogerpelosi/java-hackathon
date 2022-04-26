package com.cgi;

import com.cgi.reader.TextFileReader;

import java.io.*;

/**
 * Hello world!
 *
 */
public class TextAnalyzerApp
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Text Analyzer App");
        System.out.println("^^^^^^^^^^^^^^^^^");

        TextFileReader read = new TextFileReader();

        //read.showWordList();
        System.out.println("Alphabetical Word List: " + read.showWordList());
        read.showWordListReverse();
        System.out.println("Reverse Alphabetized Word List: " + read.showWordListReverse());
        //read.showFrequentWords();
        System.out.println("Word List By Frequency, Then Alphabetized: " + read.showFrequentWords());

    }
}
