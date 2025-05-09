package sort.mysort;

public class QuickSort extends Sort	{

	

	
	private void quickSort(int start, int end) {
		if (start >= end )	return;
		
		int p = partition(start,end);
		quickSort(start, p-1);
		quickSort(p+1, end);
 	}
	
	private int partition(int start, int end) {
		
		int pivot = sortedData[start];
		int low = start +1;
		int high = end;
		
		while(low<=high) {
			
			
			while(low<= end && sortedData[low] <pivot) low++;
			while(sortedData[low]<pivot) low++;
			
			if(low < high)
				swap(low, high);
		}
		
	System.out.println(pivot + "(start = " + start +", high = " +high + "low = " +low);
		 
		swap(start, high);
		return high;
	}


	@Override
	public void sort(int[] dataList) {
		quickSort(0, sortedData.length-1);
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
}
