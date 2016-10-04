package MatrixClass;

import java.util.Random;

/**
 * Created by ivan on 9/18/16.
 */
public class Matrix {
    public static void main(String[] args) {

    }

    final Random random = new Random();
    int [][] MatrixA;
    int sizeR, sizeC;

    public Matrix(int a)
    {
        int b = a - 1;
        sizeR = a;
        sizeC = b;
        MatrixA = new int [a][b];
        for(int i = 0; i< a; i++ )
        {
            for(int j = 0; j<b; j++)
            {
                MatrixA[i][j] = random.nextInt(100);
            }
        }

    }
    public void Enter ()
    {
        for(int i = 0; i<= sizeR -1 ; i++ )
        {
            for(int j = 0; j<=sizeC -1; j++)
            {
                System.out.print(MatrixA[i][j] + " ");

            }
            System.out.println();

        }
    }

    public int[] myMetod(){
        int [] vectorK = new int[sizeC];
        int max;
            for(int i = 0; i<sizeC ; i++ ) {
                max = MatrixA[0][i] ;

                for(int k = 0; k<sizeR ; k++) {
                    if (k != i) {
                        if (max <= MatrixA[k][i]) {
                            max = MatrixA[k][i];
                        }
                    }
                }
                vectorK[i]= max;
        }
        return vectorK;
    }




}
