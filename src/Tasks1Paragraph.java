import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks1Paragraph {
    //int[] array1 = new int[5];
    int min;

    public void FindMinFromArray(int[] array) {
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The min value of the array is: " + min);
    }

    public void FillUpArray(int[] array) {
        //System.out.println("Input numbers of array:");
        Random random = new Random();
        //Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 5000));
            //System.out.println(array[i]);
        }
    }

    public void ShowupArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Item # " + i + " is " + array[i]);
        }
    }

    public void ShowSinEverTenDegrees() {
        double[] SinArr = new double[18];
        for (int i = 0, j = 0; i <= 360; i += 10) {
            SinArr[j] = Math.sin(i);
            System.out.println("The sin of " + i + " degrees is: " + SinArr[j]);
        }
    }

    public void BubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public int IsPolyndrom(char[] polyndrom) {
        boolean ifPolyndrom = true;
        for (int i = 0, j = polyndrom.length - 1; i < polyndrom.length; i++, j--) {
            if (polyndrom[i] == polyndrom[j]) {
                ifPolyndrom = true;
                continue;
            } else if (polyndrom[i] != polyndrom[j]) {
                ifPolyndrom = false;
                System.out.println("The char array is not Palindrome");
                return 0;
            }

        }
        System.out.println("The char array is Palindrome: " + ifPolyndrom);
        return 0;
    }

    public String ReverseCharArr(String reverseStr) {
        char[] tempArr = reverseStr.toCharArray();
        String newString = "";
        int newSz;
        for (int i = 0; i < reverseStr.length(); i++) {
            newString = reverseStr.charAt(i) + newString;
        }

        //System.out.println(newString);
        return newString;

    }

    public void ReturnNumbDivOnTwo(int[] arr) {
        int[] ResArr = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] % 3 != 0)
                    ResArr[j] = arr[j];
                ++j;
            }
        }
        System.out.println("The result array values that divides on 2 and not divides on 3:");
        for (int l = 0; l < ResArr.length; l++) {
            if (ResArr[l] != 0) {
                System.out.println("The array item # " + l +
                        " value " + ResArr[l]);
            }
        }
    }


        public void ReverseNumbArr(int [] arr){
            int []resArr= new int[arr.length];
            for(int i = 0, j = arr.length-1; i< arr.length;i++, j--){
                resArr[i] = arr[j];
        }
            System.out.println("The reversed number array:");
            this.ShowupArray(resArr);



}



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n Input operation number:\n" +
                    "1 - find min value in array;\n" +
                    "2 - Type sin(x) every 10 degrees\n" +
                    "3 - Sort array from min to max\n" +
                    "4 - check if the char array String is palindrome\n" +
                    "5 - return reverse string\n" +
                    "6 - Count quantity elements that divides on 2 but not on 3\n" +
                    "7 - turn over the array\n\n");
            choice = scanner.nextInt();
            if (choice == 1) {
                int[] array1 = new int[5];
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                t1.FillUpArray(array1);
                t1.ShowupArray(array1);
                t1.FindMinFromArray(array1);
            }else if(choice ==2){
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                t1.ShowSinEverTenDegrees();
            }else if(choice ==3){
                int[] array1 = new int[7];
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                t1.FillUpArray(array1);
                t1.BubbleSort(array1);
                t1.ShowupArray(array1);

            }else if(choice ==4) {
                char[] linePolyn = new char[100];
                String s;

                Tasks1Paragraph t1 = new Tasks1Paragraph();
                System.out.println("Input char array for check palyndrome");
                    s = scanner.next();
                    linePolyn = s.toCharArray();
                    t1.IsPolyndrom(linePolyn);

            }else if(choice ==5) {
                char[] tempArr = new char[100];
                String strForReverse;
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                System.out.println("Input String for reverse");
                strForReverse = scanner.nextLine();
                strForReverse = scanner.next();
                /*if (scanner.hasNextLine()){
                    strForReverse = scanner.nextLine();
                }*/
                System.out.println(t1.ReverseCharArr(strForReverse));
            }else if(choice ==6) {
                int [] Arrray = new int[15];
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                t1.FillUpArray(Arrray);
                System.out.println("Array for separate two divided numbers:");
                t1.ShowupArray(Arrray);
                t1.ReturnNumbDivOnTwo(Arrray);

            }else if(choice ==7) {
                int[] Arrray = new int[15];
                Tasks1Paragraph t1 = new Tasks1Paragraph();
                t1.FillUpArray(Arrray);
                System.out.println("Basic array data:\n\n");
                t1.ShowupArray(Arrray);
                System.out.println("\n\n");
                t1.ReverseNumbArr(Arrray);
            }






        } while (choice != 0);
    }
}
