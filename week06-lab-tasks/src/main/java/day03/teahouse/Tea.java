package day03.teahouse;

import java.util.List;

public class Tea {
    private String name;
    private int price;
    private Sort sort;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " :" + sort.getAdditionInfo() + " (" + price + " Ft)";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Sort getSort() {
        return sort;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
