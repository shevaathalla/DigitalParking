/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.time.LocalDateTime;

/**
 *
 * @author HP ProBook
 */
public class Heap {

    private Data[] heapArray;
    private int maxSize, currentSize, id;

    public Heap() {
        maxSize = 100;
        currentSize = 0;
        heapArray = new Data[100];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void insert(Data newData, int biaya) {
        newData.insertBiaya(biaya);
        heapArray[currentSize] = newData;
        trickleUp(currentSize++);
    }

    public void trickleUp(int index) {
        int parent = (index - 1) / 2;
        Data bottom = heapArray[index];
        while (index > 0
                && heapArray[parent].getTanggalKeluar()
                < bottom.getTanggalKeluar()) {
            heapArray[index]
                    = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;

    }

    public Data remove() {
        Data root = heapArray[0];
        heapArray[0]
                = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index) {
        int largerChild;
        Data top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize
                    && heapArray[leftChild].getTanggalKeluar()
                    < heapArray[rightChild].getTanggalKeluar()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.getID() >= heapArray[largerChild].getTanggalKeluar()) {
                break;
            }
            heapArray[index]
                    = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;

    }

    public Data getData(int i) {
        return heapArray[i];
    }

    public Object[] getList(int i) {
        Object[] List = new Object[6];
        List[0] = heapArray[i].getNopol();
        List[1] = heapArray[i].getJenis();
        List[2] = heapArray[i].getBlok();
        List[3] = heapArray[i].getJamMasuk();
        List[4] = heapArray[i].getJamKeluar();
        List[5] = heapArray[i].getBiaya();
        return List;
    }

    public int getSize() {
        return currentSize;
    }

    public Data[] getAllData() {
        return heapArray;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void clear() {
        for (int i = 0; i < 100; i++) {
            heapArray[i] = null;
        }
    }
}
