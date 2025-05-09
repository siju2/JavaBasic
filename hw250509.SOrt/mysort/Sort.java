package sort.mysort;

import java.util.Arrays;


	public abstract class Sort {
		
		int[] orgData;
	    int[] sortedData;
	    
	    
	    public abstract void sort();
	    
	    
	    public void swap(int i, int j) {
	    	
			int temp = sortedData[i];
			sortedData[i] = sortedData[j];
			sortedData[j] = temp;
			
		}
	    
	    public void setData(int[] dataList) {
	    	
	    	this.orgData = dataList;
	    	this.sortedData = dataList.clone(); // deep copy
	   
	    }
	    
	    public String getOrgData() {
	    	
	    	return Arrays.toString(orgData);

	    }
	    
	    public String getSortedData() {
	    	return Arrays.toString(sortedData);

	    }


		public void sort(int[] dataList) {
			// TODO Auto-generated method stub
			
		}
	    }
	