package Aoa_Practical;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int weight;
    int profit;
    double ratio;

    public Item(int weight,int profit){
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit/weight;
    }
}

public class FractionalKnapSack {

    static double getMaxValue(int[] weights,int[] profits,int capacity){
        double totalValue = 0;
        Item[] items = new Item[weights.length];

        for(int i = 0; i< weights.length;i++){
         items[i] = new Item(weights[i],profits[i]);
        }

        Arrays.sort(items, Comparator.comparing(r->-r.ratio));
        System.out.println("|Weight|Profit|Ratio|");

        for(Item item : items){
            System.out.printf("|%7d |%6d |%6.2f |\n", item.weight, item.profit, item.ratio);
        }

        int remainingCapacity = capacity;
        for(Item item: items){
            if(item.weight <= remainingCapacity){
                totalValue += item.profit;
                remainingCapacity -= item.weight;
            }else {
                totalValue += remainingCapacity*item.ratio;
                break;
            }
        }

        return totalValue;
    }


    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] profits = {60, 100, 120};
        int capacity = 50;


        double maxValue = getMaxValue(weights,profits,capacity);
        System.out.println("Total Maximum profit is : " + maxValue);

    }
}
