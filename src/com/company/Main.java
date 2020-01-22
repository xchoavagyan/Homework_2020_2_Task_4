package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	4. create class PhotoAlbum using classes Photo

	methods
		giveNameToPhotoByIndex()
		addPhoto()
		printQuantityOfPhotos()
	 */
        Photo photo1 = new Photo("1", "1920x1080");
        Photo photo2 = new Photo("2", "1920x1080");
        Photo photo3 = new Photo("3", "1920x1080");
        Photo photo4 = new Photo("4", "1920x1080");
        Photo photo5 = new Photo("5", "1920x1080");
        Photo photo6 = new Photo("6", "1920x1080");
        Photo photo7 = new Photo("7", "1920x1080");
        Photo photo8 = new Photo("8", "1920x1080");
        Photo photo9 = new Photo("9", "1920x1080");
        Photo photo10 = new Photo("10", "1920x1080");

        PhotoAlbum album1 = new PhotoAlbum("Pictures");
        album1.addPhoto(photo1);
        album1.addPhoto(photo2);
        album1.addPhoto(photo3);
        album1.addPhoto(photo4);
        album1.addPhoto(photo5);
        album1.addPhoto(photo6);
        album1.addPhoto(photo7);
        album1.addPhoto(photo8);
        album1.addPhoto(photo9);
        album1.addPhoto(photo10);

        album1.giveNameToPhotoByIndex(1, "Sunshine");
        System.out.println(album1.getPhotos().get(0).getName());
        album1.printQuantityOfPhotos();

    }
}
