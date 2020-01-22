package com.company;

public class Photo {
    private String name;
    private String sizeInPixels;

    public Photo(String name, String sizeInPixels) {
        this.name = name;
        this.sizeInPixels = sizeInPixels;
    }

    public Photo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizeInPixels() {
        return sizeInPixels;
    }

    public void setSizeInPixels(String sizeInPixels) {
        this.sizeInPixels = sizeInPixels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        if (name != null ? !name.equals(photo.name) : photo.name != null) return false;
        return sizeInPixels != null ? sizeInPixels.equals(photo.sizeInPixels) : photo.sizeInPixels == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sizeInPixels != null ? sizeInPixels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                ", sizeInPixels='" + sizeInPixels + '\'' +
                '}';
    }
}
