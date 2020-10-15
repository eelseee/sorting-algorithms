package com.ds;

public class MergeSort {
    // Yhdistää kaksi alitaulukkoa
    // 1. alitaulukko on array[firstPoint, .., middlePoint]
    // 2. alitaulukko on array[middlePoint + 1, .., lastPoint]
    void merge(int array[], int firstPoint, int middlePoint, int lastPoint)
    {
        // Tallennetaan alitaulukkojen koot
        int size1 = middlePoint - firstPoint + 1;
        int size2 = lastPoint - middlePoint;

        // Luodaan aputaulukot
        int TempArray1[] = new int[size1];
        int TempArray2[] = new int[size2];

        // Kopioidaan alkiot aputaulukkoon
        for (int i = 0; i < size1; ++i)
            TempArray1[i] = array[firstPoint + i];
        for (int j = 0; j < size2; ++j)
            TempArray2[j] = array[middlePoint + 1 + j];

        /* Yhdistetään aputaulukot */

        // Alustetaan indeksit 1. ja 2. alitaulukolle
        int i = 0, j = 0;

        // Alustetaan indeksi yhdistetylle alitaulukolle
        int k = firstPoint;
        // Lomitetaan 1. ja 2. taulukon alkiot tarvittaessa
        while (i < size1 && j < size2) {
            if (TempArray1[i] <= TempArray2[j]) {
                array[k] = TempArray1[i];
                i++;
            }
            else {
                array[k] = TempArray2[j];
                j++;
            }
            k++;
        }

        // Kopioidaan jäljellä olevat 1. aputaulukon alkiot, jos niitä on jäljellä
        while (i < size1) {
            array[k] = TempArray1[i];
            i++;
            k++;
        }

        // Kopioidaan jäljellä olevat 1. aputaulukon alkiot, jos niitä on jäljellä
        while (j < size2) {
            array[k] = TempArray2[j];
            j++;
            k++;
        }
    }

    // Lajittelee taulukon
    void sort(int array[], int firstPoint, int lastPoint)
    {
        if (firstPoint < lastPoint) {
            // Etsitään taulukon keskimmäinen indeksi
            int middlePoint = (firstPoint + lastPoint) / 2;

            // Lajitellaan ensimmäinen puolikas
            sort(array, firstPoint, middlePoint);
            //Lajitellaan toinen puolikas
            sort(array, middlePoint + 1, lastPoint);

            // Yhdistetään lajitellut  puolikkaat
            merge(array, firstPoint, middlePoint, lastPoint);
        }
    }
}
