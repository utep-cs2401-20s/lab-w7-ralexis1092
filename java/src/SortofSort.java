public class SortofSort {

    public static void sortOfSort(int[] array){

        int upperBound = array.length -1; //inclusive
        int lowerBound = 0; //inclusive

        for(int i = 0; i < array.length; i++){

            //Stores the biggest element in Max from lowerBound to upperbound
            int index = 0;
            int max = array[lowerBound];
            int temp = 0;
            for(int j = lowerBound; j <= upperBound; j++){
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            if(i % 4== 0 || i % 4 == 1){
                array[index] = array[upperBound];
                array[upperBound] = max;
                upperBound--;

            }
            if(i % 4== 2 || i % 4 == 3){
                array[lowerBound] = max;
                array[index] = array[lowerBound];
                lowerBound++;
            }





        }


    }

}
