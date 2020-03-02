public class SortofSort {

    public static void sortOfSort(int[] array){

        int upperBound = array.length; //inclusive
        int lowerBound = 0; //inclusive

        for(int i = 0; i < array.length; i++){

            //Stores the biggest element in Max from lowerBound to upperbound
            int max = array[lowerBound];
            int temp = 0;
            for(int j = lowerBound; j < upperBound; j++){
                if(max < array[j]){
                    max = array[j];
                }
            }
            if(i % 4== 0 || i % 4 == 1){
                upperBound--;
                array[upperBound] = max;
            }
            if(i % 4== 2 || i % 4 == 3){
                array[lowerBound] = max;
                lowerBound++;
            }





        }


    }

}
