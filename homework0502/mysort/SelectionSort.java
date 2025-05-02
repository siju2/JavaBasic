package sort.mysort;

public class SelectionSort extends Sort {

    @Override
    public void sort(int[] dataList) {
    	
        for (int last = dataList.length - 1; last >= 1; last--) {
            int maxIndex = selectMax(dataList, last);
            if (maxIndex != last) {
                swap(dataList, maxIndex, last);
                
            }
            
        }
        
    }

    private int selectMax(int[] dataList, int last) {
    	
        int max = dataList[0];
        int maxIndex = 0;

        for (int i = 1; i <= last; i++) {
        	
            if (dataList[i] > max) {
            	
                max = dataList[i];
                maxIndex = i;
                
            }
        }
        
        return maxIndex;
    }

    private void swap(int[] dataList, int i, int j) {
    	
        int temp = dataList[i];
        dataList[i] = dataList[j];
        dataList[j] = temp;
        
    }
}
