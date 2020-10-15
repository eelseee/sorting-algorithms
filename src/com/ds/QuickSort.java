package com.ds;

public class QuickSort {
    /*
   Funktio ottaa viimeisen elementin pivot-alkioksi,
   asettaa pivot-alkion oikealle paikalleen lajitellussa
   taulukossa ja asettaa kaikki pivotia pienemmät alkiot
   vasemmalleja suuremmat oikealle puolelle
   */
    int partition(int array[], int startingIndex, int endingIndex)
    {
        int pivot = array[endingIndex];
        int i = (startingIndex-1); // index of smaller element
        for (int j=startingIndex; j<endingIndex; j++)
        {
            // jos alkio on pienempi kuin  pivot
            if (array[j] < pivot)
            {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[endingIndex] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[endingIndex];
        array[endingIndex] = temp;

        return i+1;
    }


    // pikalajittelualgoritmi
    void sort(int array[], int startingIndex, int endingIndex)
    {
        if (startingIndex < endingIndex)
        {
            // array[partitionIndex] on pivot-alkio
            int partitionIndex = partition(array, startingIndex, endingIndex);

            // Lajitellaan alkiot ennen ja jälkeen jakamisen
            sort(array, startingIndex, partitionIndex-1);
            sort(array, partitionIndex+1, endingIndex);
        }
    }
}
