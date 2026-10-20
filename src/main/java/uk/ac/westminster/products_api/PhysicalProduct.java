package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    //a
    public PhysicalProduct(){}

    //b
    public PhysicalProduct(Long id,String name,double price){
        super(id, name, price);
        this.weightKg = weightKg ;
        this.dimensions = dimensions ;



    }
    //c

    public double getWeightKg() {
        return this.weightKg;
    }
    public String getDimensions(){
        return this.dimensions;
    }
}
