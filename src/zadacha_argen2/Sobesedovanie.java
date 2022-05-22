package zadacha_argen2;


import java.util.Arrays;

public class Sobesedovanie {
    public static void main(String[] args) {
        int[] array = {-1, 2, 3, 5, 6, 7, 8, 10};
        int i = 0;
        int j = array.length - 1;
        int k = 9;
        while (i < j){
            if(array[i] + array[j] == k){
                System.out.println(array[i] + ", " +array[j]);
            }
            if(array[i] + array[j] < k){
                i++;
            } else {
                j--;
            }
        }

//        int i = 0;
//        int j = array.length - 1;
//        int k = 1;
//        while (i < array.length){
//            if(array[i] + array[j] == 9){
//                System.out.println("Уникальная пара номер № " + k + " : " + array[i] + " , " + array[j]);
//                k++;
//            }
//            i++;
//            if(i == array.length - 1){
//                i = 0;
//                j--;
//            }
//            if(k == 4){
//                return;
//            }
//        }

    }
}