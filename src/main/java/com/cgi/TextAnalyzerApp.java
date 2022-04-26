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

        read.showWordList();

    }
}
