package by.belhard.j2.lesson4a.entity;

public class Country {
    private String title;
    private int ZipCode;

    public Country(String title, int zipCode) {
        this.title = title;
        ZipCode = zipCode;
    }

    public String getTitle() {
        return title;
    }

    public int getZipCode() {
        return ZipCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", ZipCode=" + ZipCode +
                '}';
    }
}
