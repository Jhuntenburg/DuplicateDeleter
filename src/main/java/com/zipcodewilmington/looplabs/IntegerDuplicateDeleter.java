package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 *
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        String nonDuplicates = "";
        for (int i = 0; i < array.length; i++) {
            Integer integer = array[i];
            Integer counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }


            }
            if (!(counter >= maxNumberOfDuplications)) {
                nonDuplicates += array[i];
            }
        }
        String[] stringResult = nonDuplicates.split("");
        Integer[] result = new Integer[stringResult.length];

        if (nonDuplicates.equals("")) {
            return new Integer[0];
        } else {

            for (int i = 0; i < result.length; i++) {

                result[i] = Integer.valueOf(stringResult[i]);

            }
        }


        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String nonDuplicates = "";
        for (int i = 0; i < array.length; i++) {
            Integer integer = array[i];
            Integer counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }


            }
            if (!(counter == exactNumberOfDuplications)) {
                nonDuplicates += array[i];
            }
        }
        String[] stringResult = nonDuplicates.split("");
        Integer[] result = new Integer[stringResult.length];
        for (int i = 0; i < result.length; i++) {
            String number = nonDuplicates.charAt(i) + "";
            result[i] = Integer.valueOf(stringResult[i]);

        }
        return result;
    }
}
