package com.company;

import java.util.ArrayList;

public class PhotoAlbum {
    private String NameOfAlbum;
    private ArrayList<Photo> photos = new ArrayList<>();

    public PhotoAlbum(String nameOfAlbum, ArrayList<Photo> photos) {
        NameOfAlbum = nameOfAlbum;
        this.photos = photos;
    }

    public PhotoAlbum(String nameOfAlbum) {
        NameOfAlbum = nameOfAlbum;
    }

    public String getNameOfAlbum() {
        return NameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        NameOfAlbum = nameOfAlbum;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbum that = (PhotoAlbum) o;

        if (NameOfAlbum != null ? !NameOfAlbum.equals(that.NameOfAlbum) : that.NameOfAlbum != null) return false;
        return photos != null ? photos.equals(that.photos) : that.photos == null;
    }

    @Override
    public int hashCode() {
        int result = NameOfAlbum != null ? NameOfAlbum.hashCode() : 0;
        result = 31 * result + (photos != null ? photos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "NameOfAlbum='" + NameOfAlbum + '\'' +
                ", photos=" + photos +
                '}';
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void giveNameToPhotoByIndex(int index, String name) {
        this.photos.get(index - 1).setName(name);
    }

    public void printQuantityOfPhotos() {
        System.out.println("Photos in album : " + this.photos.size());
    }
}

