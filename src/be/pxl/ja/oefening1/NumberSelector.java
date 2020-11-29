package be.pxl.ja.oefening1;

import java.util.function.Function;

public class NumberSelector {

	NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		 NumberFilter evenNumberFilter = new NumberFilter(){
			@Override
			public boolean check(int number){
				if (number % 2 == 0){
					return true;
				}else {
					return false;
				}
			}
		};
		return numberMachine.processNumbers(evenNumberFilter);


	}

	public String printHexNumbers() {

		 return numberMachine.convertNumbers(number -> {return Integer.toHexString(number); } );
	}

	public String showNumbersAbove(int number) {
		NumberFilter numbersAboveFilter =  number1 -> { return number1 > number;};
		return numberMachine.processNumbers(numbersAboveFilter);
	}




}