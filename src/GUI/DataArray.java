/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ProBook
 */
public class DataArray {

    private int nElemen = 0, size = 20;
    private int id = 1;
    int iA = 0, iB = 0, iC = 0, iD = 0;
    private String[] blokA = new String[5];
    private String[] blokB = new String[5];
    private String[] blokC = new String[5];
    private String[] blokD = new String[5];
    public Data[] dataList = new Data[size];

    public DataArray() {
    }

    public Data find(String nopol) {
        int i = 0;
        while (dataList[i] != null) {
            if (dataList[i].getNopol().equals(nopol)) {
                return dataList[i];
            }
            i++;
        }
        return null;
    }

    public void insert(String nopol, String jenis, String blok) {
        insertToBlok(nopol, blok);
        dataList[nElemen] = new Data(id, nopol, jenis, blok);
        nElemen++;
        id++;
    }

    public void insertToBlok(String nopol, String blok) {
        switch (blok) {
            case "A":
                blokA[iA++] = nopol;
                break;
            case "B":
                blokB[iB++] = nopol;
                break;
            case "C":
                blokC[iC++] = nopol;
                break;
            case "D":
                blokD[iD++] = nopol;
                break;
        }
    }

    public boolean delete(int id) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (dataList[i].getID() == id) {
                break;
            }
        }
        if (nElemen == i) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                dataList[j] = dataList[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public Object[] getData(int i) {
        Object[] List = new Object[5];
        List[0] = dataList[i].getID();
        List[1] = dataList[i].getNopol();
        List[2] = dataList[i].getJenis();
        List[3] = dataList[i].getBlok();
        List[4] = dataList[i].getJamMasuk();
        return List;
    }

    public int getSize() {
        return nElemen;
    }

    public int getLBlok() {
        return blokA.length;
    }

    public boolean isEmpty(String blok) {
        switch (blok) {
            case "A":
                if (blokA[blokA.length - 1] != null) {
                    return false;
                }
                break;
            case "B":
                if (blokB[blokB.length - 1] != null) {
                    return false;
                }
                break;
            case "C":
                if (blokB[blokC.length - 1] != null) {
                    return false;
                }
                break;
            case "D":
                if (blokB[blokD.length - 1] != null) {
                    return false;
                }
                break;
        }
        return true;
    }

    public String getSizelbl() {
        String size = nElemen + " / " + dataList.length;
        return size;
    }

    public int getBlokASize() {
        int sizeA = 0;
        for (String blokA1 : blokA) {
            if (blokA1 != null) {
                sizeA++;
            }
        }
        return sizeA;
    }

    public int getBlokBSize() {
        int sizeB = 0;
        for (String blokB1 : blokB) {
            if (blokB1 != null) {
                sizeB++;
            }
        }
        return sizeB;
    }

    public int getBlokCSize() {
        int sizeC = 0;
        for (String blokC1 : blokC) {
            if (blokC1 != null) {
                sizeC++;
            }
        }
        return sizeC;
    }

    public int getBlokDSize() {
        int sizeD = 0;
        for (String blokC1 : blokD) {
            if (blokC1 != null) {
                sizeD++;
            }
        }
        return sizeD;
    }

    public Data update(int id) {
        int i = 0;
        while (dataList[i] != null) {
            if (dataList[i].getID() == id) {
                return dataList[i];
            }
            i++;
        }
        return null;
    }

    public Data[] getAllData() {
        return dataList;
    }

}
