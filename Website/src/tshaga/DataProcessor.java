/* This java program calculates mean and standard deviation of the data entered by the user */



package tshaga;
import java.util.Properties;


public class DataProcessor{

     public float Meancaluculation(String data){
    	String data1[] = data.split(",");
    	float mean = 0;
		for(int i=0; i< data1.length; i++)
    		mean =mean+ Integer.parseInt(data1[i]);
    	 mean = mean/ data1.length;
    	return mean;
    }
    
    public double sdcalculation(String data, float mean){
    	String[] data1 = data.split(",");
    	double sum=0;
    	double sd = 0;
		for(int i=0; i< data1.length; i++){
    		sum = Math.pow((Integer.parseInt(data1[i]) - mean), 2); 
    	}
    	sd =  Math.sqrt(sum/(data1.length));
    	return sd;
    }
}