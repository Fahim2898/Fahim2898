package data;

import java.util.ArrayList;

public class Merge 
{
    public static void main (String [] args) 
    {
        Merge run = new Merge();
        run.test();
    }

    public void test ( )
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 16; i++)
        {
            boolean add = numbers.add(1 + (int)(Math.random() * 100));
        }
        printArray(numbers);
        mergeSort(numbers);
        printArray(numbers);
    }

    public void printArray (ArrayList<Integer> array)
    {
        System.out.println("\n\n");
        for (int i = 0; i < array.size(); i++)
        {
            System.out.printf("%-5d",array.get(i));
        }
        System.out.println("\n\n");
    }

    public void mergeSort (ArrayList<Integer> array) 
    {   
        int length = array.size();
        if (length < 2)
        {
            return;  // the array is already sorted in this case
        }
        // divide
        ArrayList<Integer> array1 = new ArrayList<>(); 
        ArrayList<Integer> array2 = new ArrayList<>(); 
        int i = 0;

        while (i < length/2)
        {
            array1.add(array.remove(0)); // move the first n/2 elements to array1
            i++;
        }
        while (!array.isEmpty())
        {
            array2.add(array.remove(0)); // move the rest to array2
        }

        mergeSort(array1);
        mergeSort(array2);
        merge(array1,array2,array); 
    }

    public void merge (ArrayList<Integer> array1, ArrayList<Integer> array2, ArrayList<Integer> array)
    {   
        while (!array1.isEmpty() && !array2.isEmpty())
        {
            if ((array1.get(0).compareTo(array2.get(0)) <= 0))
            {
                array.add(array1.remove(0));
            }
            else
            {
                array.add(array2.remove(0));
            }
        }
        while(!array1.isEmpty()) // move the remaining elements of array1
        {
            array.add(array1.remove(0));
        }
        while(!array2.isEmpty()) // move the remaining elements of array2
        {
            array.add(array2.remove(0));
        }
    }
}