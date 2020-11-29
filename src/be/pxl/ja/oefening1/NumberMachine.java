package be.pxl.ja.oefening1;

import java.util.ArrayList;
import java.util.function.Function;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}



	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}


	public String convertNumbers(Function<Integer , String > hex){
		String result = "";
		for (int i=0;i<numbers.size();i++){
			if(!result.equals("")) {
				result += "-";
			}
			result += hex.apply(numbers.get(i));
		}
		return result;
	}
}
