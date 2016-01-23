
public class WeightTester
{
  public static void main ( String[] args ){
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    if(values.length % 2 == 0){
    	System.out.println("difference = " + (june.subAverage(0, values.length / 2) - june.subAverage(values.length / 2, values.length)));
    }else{
    	System.out.println("difference = " + (june.subAverage(0, values.length / 2 + 1) - june.subAverage(values.length / 2, values.length)));
    }
  }
}    
