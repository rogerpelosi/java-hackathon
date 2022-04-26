package com.cgi.reader;

import com.cgi.models.Word;
import com.cgi.models.WordList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TextFileReader {

    public TextFileReader(){}

    public WordList showWordList() throws IOException {

      WordList returnedWordList = new WordList();
      List<Word> wordList = new ArrayList<>();
      List<Word> condensedList = new ArrayList<>();

      FileReader fReader = new FileReader("data/daffodils.txt");
      BufferedReader bReader = new BufferedReader(fReader);

      String[] firstLine = bReader.readLine().split("[,.:; ]");
      for(String val: firstLine){
          wordList.add(new Word(val, 1));
      }

      System.out.println(wordList);

      while(bReader.ready()){
          String[] wordsByLine = bReader.readLine().split("[,.:; ]");
          for(String val : wordsByLine){
              if(!val.isEmpty()){
              wordList.add(new Word(val.toLowerCase(), 1));
              }
          }
      }

        Map<Object, List<Word>> countList = wordList.stream().collect(Collectors.groupingBy(x->x.getTheWordItself(), Collectors.toList()));

      for(Object key : countList.keySet()){
          //System.out.println(key.toString() + " " + (countList.get(key)).size());
          condensedList.add(new Word(key.toString(), (countList.get(key)).size()));
      }



//      wordList.stream().forEach(x->{
//          if(condensedList.size() == 0){
//              condensedList.add(x);
//          } else {
//              condensedList.parallelStream().forEach(y->{
//                  if(y.getTheWordItself().equalsIgnoreCase(x.getTheWordItself())){
//                      y.setSingularWordOccurrence(y.getSingularWordOccurrence() + 1);
//                  } else {
//                      condensedList.add(x);
//                  }
//              });
////              for(Word eachWord : condensedList){
////                  if(eachWord.getTheWordItself().equalsIgnoreCase(x.getTheWordItself())){
////                      eachWord.setSingularWordOccurrence(eachWord.getSingularWordOccurrence()+ 1);
////                  } else {
////                      condensedList.add(x);
////                  }
////              }
//          }
//      });

        System.out.println(wordList.size());
        System.out.println(condensedList);
        returnedWordList.setWordList(condensedList);

      bReader.close();
      fReader.close();
      return returnedWordList;

    }

}
