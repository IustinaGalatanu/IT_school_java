package org.example.Homework.session18;

import java.util.Objects;

//Create a Song class with title, artist, and length fields. Implement the equals() method to check only the title and artist fields. Implement the hashCode() method to use the title and artist fields to calculate the hash code. Test that two instances with the same title and artist return true for equals() and have the same hash code.
public class Song {
    private String title;
    private String artist;
    private int lenghtFields;

    public Song(String title, String artist, int lenghtFields) {
        this.title = title;
        this.artist = artist;
        this.lenghtFields = lenghtFields;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if( o==null || getClass()!=o.getClass()) return false;
        Song song=(Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);

    }
    @Override
    public int hashCode(){
        return Objects.hash(title,artist);
    }

}

class Songs{
    public static void main(String[] args) {

        Song song1=new Song("NuevaYol","Bad Bunny",1);
        Song song2=new Song("NuevaYol","Bad Bunny",1);

        System.out.println("song1 equals song2 "+song1.equals(song2));

        System.out.println("hashcode for song 1 "+ song1.hashCode());
        System.out.println("hashcode for song 2 "+ song2.hashCode());

    }
}
