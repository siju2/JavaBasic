package sort.mysort;

public class BubbleSort extends Sort {


	
	@Override
	public void sort() {
		quickSort(0, sortedData.length-1);
	}
	
	

			private int partition(int start, int end) {
			// TODO Auto-generated method stub
			return 0;
		}

		    private void quickSort(int start, int end) {
		        if (start >= end) return;
		        int p = partition(start, end);
		        quickSort(start, p - 1);
		        quickSort(p + 1, end);
		    }



			@Override
			public void sort(int[] dataList) {
				// TODO Auto-generated method stub
				
			}
		
}
			
