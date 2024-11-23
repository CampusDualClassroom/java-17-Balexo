package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		int [] array = new int [positions];
		return array;
	}

	public static String[] createInitializedStringArray() {
		String [] stringArray = new String[3];
		stringArray[0] ="1";
		stringArray[1]="2";
		stringArray[2]="3";

		return stringArray;
	}

	public static void populateArray(int[] array, int index, int value) {
		if(index<0 || index>=array.length){
			throw new ArrayIndexOutOfBoundsException("Índice fuera de los valores");
		}
		array[index]=value;
	}

	public static int arrayLength(int[] array) {
		 return array.length;

	}

	public static void showValue(int[] array, int index) {
		if(index<0 || index>=array.length ){
			throw new ArrayIndexOutOfBoundsException("Índice fuera de los valores");
		}
		int value = array[index];
		System.out.println(value);
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
