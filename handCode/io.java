import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.StreamTokenizer;

class io{
	LinkedList<Integer> numList;
	/**first nested methods */
	public io(LinkedList<Integer> numbers){
		numList = numbers; 
	}
	
	public void readDocument(){	
		//TODO
	}
	public double max(LinkedList<Integer> summary){
		double total = 0;
		if(summary.size() == 0){
			return total;
		}else{
			
		}
	}
	
	
	public double average(LinkedList<Integer> summary){
		double total = 0;
		if(summary.size() == 0){
			return total;
		}else{
			for(int i = 0; i< summary.size(); i++){
				System.out.print(""+ summary.get(i));
			    total += summary.get(i);
		    }
			return total/(summary.size()-1);
		}
	}
	
	public LinkedList<Integer> createDocument() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter file name: ");
		String filename = in.readLine();
		BufferedWriter out = new BufferedWriter(new FileWriter(filename+".txt"));
		numList = new LinkedList<Integer>();
		try {
			String inputLine = null;
			System.out.print("\nEnter numbers and then press enter: ");
			do {
				inputLine=in.readLine();
				out.write(inputLine);
				String[] numbers = inputLine.split(",");
				 for(int i = 0; i < numbers.length; i++){
					numList.add(Integer.parseInt(numbers[i]));
				}
				if(inputLine.equalsIgnoreCase("0")){
					break;
				}
				System.out.print("Try again or enter Zero+Enter to quit.\n");
				//out.newLine();
			}while (!inputLine.equalsIgnoreCase("0"));
			System.out.print("\nFile saved successfully.");
		} catch(IOException e) {
			System.out.println("Error during reading/writing");
		} catch(NumberFormatException e){
			System.out.println("Please enter numbers separated by commas.");
		}finally {
			out.close();
			in.close();
		}
		return numList;
	}
	
	public static void main(String[] args){
		if(args.length == 0){
			//LinkedList<Integer> numbers = new LinkedList<Integer>(); 
			io numbersList = new io();
			try{
			   //System.out.println("\nList: "+ numbersList.createDocument());
			   System.out.println("\nAverage: "+ numbersList.average(numbersList.createDocument()));
			}catch(IOException e) {
				System.out.println("Error during reading/writing");
			}
		}else{
			System.out.print("\nArguments at the command line are not allowed in this program.\n");
		}
	}
}
