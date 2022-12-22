import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int n = 10; //we could define scanner here

        int[] genArr = generateArray(n);
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println(equalsReverse(sortedArr,revArr));

    }

//    public static int zeskanujLiczbe() {
//        return new Scanner(System.in).nextInt();

    public static int[] generateArray(int n)
    {
        int[] a = new int[n];

        for (int j = 0; j < a.length; j++) {
            int random = (int) (Math.random() * 100 + 1);
            a[j] = random;
        }
        return a;

    }
    public static int[] printArray(int[] genArr) {
       for (int j : genArr) {
            System.out.println(j);
        }
       return genArr;
    }

    public static int [] sort(int[] genArr) {


        for (int i = 0; i < genArr.length; i++) {
            int temp;
            for (int j = i + 1; j < genArr.length; j++) {
                if (genArr[i] > genArr[j]) {
                    temp = genArr[i];
                    genArr[i] = genArr[j];
                    genArr[j] = temp;
                }
            }
        }
        return genArr;
    }

    public static int [] reverse(int[]sortedArr) {

        int temp;

        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] < sortedArr[j]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        return sortedArr;
    }

    public static String equalsReverse(int[] sortedArr, int[] revArr){
        String result;
        if(Arrays.equals(sortedArr,revArr)) {
            result = "true";
        }
        else{
             result = "false";
        }
        return result;
    }

}



