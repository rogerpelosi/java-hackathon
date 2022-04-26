package com.cgi;

public class Word {

    private String theWordItself;
    public String getTheWordItself() {return theWordItself;}
    public void setTheWordItself(String theWordItself) {this.theWordItself = theWordItself;}

    private int singularWordOccurrence;
    public int getSingularWordOccurrence() {return singularWordOccurrence;}
    public void setSingularWordOccurrence(int singularWordOccurrence) {this.singularWordOccurrence = singularWordOccurrence;}

    public Word(){}

    public Word(String theWordItself, int singularWordOccurrence){
        this.theWordItself = theWordItself;
        this.singularWordOccurrence = singularWordOccurrence;
    }

    @Override
    public String toString() {
        return "Word{" +
                "theWordItself='" + theWordItself + '\'' +
                ", singularWordOccurrence=" + singularWordOccurrence +
                '}';
    }

}
