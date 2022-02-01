import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array={10,20,20,10,10,20,5,20};
        int[] array2=new int[array.length];

        array2=array;
        int counter=0;
        int counter2=0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]== array2[j]){
                    counter++;


                }




            }






            for (int j = 0; j < array.length; j++) {
                if (array[i]==array2[j]){


                    System.out.println(array[i]+" sayısı "+counter +" kez tekrar edildi.");




                    array[i]=0;



                }
            }
            counter=0;
        }

    }
}
