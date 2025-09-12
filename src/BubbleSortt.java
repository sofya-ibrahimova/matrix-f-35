import java.util.Arrays;

public class BubbleSortt {
    public static void main(String[] args) {
        int [] array = {5,1,3,4,2};
bubbleSort(array);

    }

    static void bubbleSort (int[]x){
        int n = x.length;
        for(int i = 0; i<n-1; i++){
            for (int j= 0; j<n-i-1; j++){
                if(x[j]>x[j+1]){
                    int a = x[j];
                    x[j]=x[j+1];
                    x[j+1]= a;
                }
            }
        }System.out.println(Arrays.toString(x));
    }

}

