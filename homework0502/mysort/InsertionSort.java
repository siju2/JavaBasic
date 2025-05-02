package sort.mysort;

public class InsertionSort extends Sort{
	
	@Override
	public void sort() {
		for(int i = 1; i<sortedData.length; i++) {
			
			int loc = findLessFromLast(sortedData[i], i-1);
			if (loc +1 !=i)
				insertData(loc+1, i);

			
		}
	}
	
	private void insertData(int target , int source) {
		
		// TODO Auto-generated method stub
		
	}

	private int findLessFromLast(int data, int last) {
		for (int i =last; i>=0; i--) {
			if(sortedData[i]<data) {
				return i;
				
				
			}
		}
		
		return -1;
		
	}

	@Override
	public void sort(int[] dataList) {
		// TODO Auto-generated method stub
		
	}

}
