
class Weight{
  int[] data;
  
  // Constructor
  Weight(int[] init){
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int i = 0; i < init.length; i++){
      data[i] = init[i];
    }
  }
  
  //Print
  public String toString(){
	  String finals = "";
	  for(int i = 0; i < data.length; i++){
		  finals += data[i] + ", ";
	  }
	  return finals.substring(0, finals.length() - 2);
  }
  
  public int average(){
	  int total = 0;
	  for(int i = 0; i < data.length; i++){
		  total += data[i];
	  }
	  return total / data.length;
  }
}
