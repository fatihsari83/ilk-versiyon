package Ders18_Multi_Dimensional_Arrays;

public class C07_MDA {
    public static void main(String[] args) {

        int[][] arr = {{13, 25, 37}, {41, 12, 23, 44}, {11, 25}, {17}};

        // 20 ile 40 arasinda olan sayilarin (20ve 40 dahil)
        // toplamini bulun

        int istenenElementleriToplami = 0;

        for (int i = 0; i < arr.length; i++) { // outer array icin

            for (int j = 0; j < arr[i].length; j++) { // // iner array icin

                if (20 <= arr[i][j] && 40 >= arr[i][j]) {
                    istenenElementleriToplami += arr[i][j];
                }
            }

        }
        System.out.println("Istenen elementlerin sayisi : " + istenenElementleriToplami);
    }
}


