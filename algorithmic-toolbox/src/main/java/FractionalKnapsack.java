import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * The maximum total value of fractions of items that fit into a bag of capacity W.
 */
public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
        Item[] items = new Item[values.length];
        for(int i=0; i<items.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        Arrays.sort(items);
        int index = 0;
        int weight = 0;
        while(weight < capacity && index < items.length) {
            Item item = items[index];
            index++;
            if(item.getWeight() + weight <= capacity) {
                weight += item.getWeight();
                value += item.getValue();
            } else {
                int remain = capacity - weight;
                // rounded to 4 decimals.
                double fractionOfWeight = ((double) item.getWeight() / remain);
                weight += remain;
                value += ((double) item.getValue() / fractionOfWeight);
            }
        }
        return value;
    }

    static class Item implements Comparable<Item> {
        int weight;
        int value;
        double weightedValue;

        Item(int value, int weight) {
            this.weight = weight;
            this.value = value;
            weightedValue = ((double) value / weight);
        }

        int getWeight() {
            return weight;
        }

        int getValue() {
            return value;
        }

        double getWeightedValue() {
            return weightedValue;
        }

        @Override
        public int compareTo(Item o) {
            return Double.compare(o.getWeightedValue(), this.getWeightedValue());
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(new DecimalFormat("#.0000").format(getOptimalValue(capacity, values, weights)));
    }
}
