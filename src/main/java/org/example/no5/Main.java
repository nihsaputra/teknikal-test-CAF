package org.example.no5;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        List<Item> daftarItems = new ArrayList<>();

        daftarItems.add(new Item("Jaket", 34, 12));
        daftarItems.add(new Item("Hoodie", 25, 5));
        daftarItems.add(new Item("Shirt", 12, 50));

        fashionista(daftarItems);

    }
    private static void fashionista(List<Item> items){
        float originalPrice = 0;
        float salePrice = 0;
        float amountSave = 0;

        for (Item item : items) {
            // mencari original price
            originalPrice += item.getPrice();
            // mencari amount price
            amountSave += item.getPrice()/100* item.getPercent();
            // mencari sale price
            salePrice += item.getPrice() - (item.getPrice()/100* item.getPercent());


        }
        System.out.println("Total Original Price : " + originalPrice);
        System.out.println("Total sale price : " + salePrice);
        System.out.println("Amount save : " + amountSave);
    }

}
