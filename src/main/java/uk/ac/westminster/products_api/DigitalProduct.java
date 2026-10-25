package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadURL;
    private double fileSizeMB;

    public DigitalProduct(Long id, String name, double price,String url,double size) {
        //super(id,name, price);
        this.downloadURL = url;
        this.fileSizeMB = size;

    }
    public String getDownloadURL(){
        return this.downloadURL;

    }

    public double getFileSizeMB(){
        return this.fileSizeMB;
    }

}
