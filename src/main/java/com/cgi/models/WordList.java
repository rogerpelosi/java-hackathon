package com.cgi.models;

import java.util.List;

public class WordList {

    private List<Word> wordList;
    public List<Word> getWordList() {return wordList;}
    public void setWordList(List<Word> wordList) {this.wordList = wordList;}

    public WordList(){}

    public WordList(List<Word> wordList){
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        return "WordList{" +
                "wordList=" + wordList +
                '}';
    }

}
