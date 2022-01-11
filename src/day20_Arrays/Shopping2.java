package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Shopping2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String[]items = new String[5];
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        int indexNumberOf = 0;
        String itemList = "";
        for (int a = 0; a < items.length; a++) {

            for (int i = 0; i < items.length; i++) {
                if ("Gloves".equals(items[i])) {
                    indexNumberOf = i;
                }
            }
            for (int i = 0; i < prices.length; i++) {
                if ("iPad".contains(items[i])) {
                    itemList += "Yes, \"iPad\" is contained in shopping list";
                }
            }
            System.out.println(items[a] + " - $" + prices[a] + " -#" + itemIDs[a]);
        }
        System.out.println("Index number of \"Gloves\"" + indexNumberOf);
        System.out.println(itemList);
    }}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */