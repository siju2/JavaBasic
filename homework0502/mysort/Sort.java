package sort.mysort;

import java.util.Arrays;

public abstract class Sort {
    
    int[] orgData;
    int[] sortedData;

    public abstract void sort(int[] dataList);

    public void setData(int[] dataList) {
        this.orgData = dataList;
        this.sortedData = dataList.clone();
    }
    

    public String getOrgData() {
        return Arrays.toString(orgData);
    }

    public String getSortedData() {
        return Arrays.toString(sortedData);
    }


  
    public void setData(Integer[] numList) {
        int[] c = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            c[i] = numList[i];
        }
        setData(c);
    }


    public void sort() {
        sort(sortedData); 
    }
}
