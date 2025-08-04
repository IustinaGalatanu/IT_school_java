package org.example.Homework.session18;
//Extend an enum representing car types to include properties such as average price and manufacturer. Override the toString method to provide a descriptive string representing each enum constant.
public enum CarType {
    MINIVAN("Honda", 28000),
    SUV("Ford", 35000),
    COUPE("BMW", 45000);

    private final String manufacturer;
    private final int averagePrice;

    CarType(String manufacturer, int averagePrice) {
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return this.name() + " (Manufacturer: " + manufacturer + ", Average Price: $" + averagePrice + ")";
    }
}
class Cars {
    public static void main(String[] args) {
        for (CarType type : CarType.values()) {
            System.out.println(type);
        }
    }
}



