import MatrixClass.Matrix;
import Jama.*;
public class Main {

    public static void main(String[] args) {

        Matrix qwe = new Matrix(5);
        qwe.Enter();
        int [] arr = qwe.myMetod();
        System.out.println();
        for(int i =0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        //-----------------------------------------------------------
        Jama.Matrix matrixR =  Jama.Matrix.random(4,4);
        Jama.Matrix matrixA =  Jama.Matrix.random(4,4);
        Jama.Matrix matrixB =  Jama.Matrix.random(4,4);
        Jama.Matrix matrixC =  Jama.Matrix.random(4,4);

        matrixA  = matrixA.inverse();
        matrixR  = matrixB.times(matrixC);
        matrixA  = matrixA.plus(matrixR);
        int result = matrixA.rank();
        System.out.println();
        System.out.println(result);
    }
}