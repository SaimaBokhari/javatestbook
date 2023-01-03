package practice;

public class MatrixMultiplication {
    /*
    If the number of columns of first matrix (say M1) match with the number of rows
    of second matrix (say M2), then matrix multiplication is possible, otherwise not.

    In JAVA, matrix are represented by two-dimensional arrays.

    int x[][] = {{1,5,7},{8,3,8},{7,2,9}};
    int y[][] = {{2,8,9},{1,9,1},{4,8,1}};

    int z[][] = new int[3][3];   //create an empty resultant matrix (two-dimensional arrays)

    for(int a=0; a<3; a++){
       for(int b=0; b<3; b++){
       z[a][b]=0;
       for(int c=0; c<3; c++){
       z[a][b] = z[a][b] + x[a][c]* y[c][b];
       }
       }
       sout(z[a][b]+ " ");
       sout();
    }

     */
    public static void main(String[] args) {
        int x[][] = {{1,5,7},{8,3,8},{7,2,9}};
        int y[][] = {{2,8,9},{1,9,1},{4,8,1}};

        int z[][] = new int[3][3];

        for (int a=0; a<3; a++){
            for (int b=0; b<3; b++){
                z[a][b] = 0;
                for (int c=0; c<3; c++){
                    z[a][b]= z[a][b] + x[a][c]*y[c][b];
                }
                System.out.print(z[a][b] + " ");
            }
            System.out.println(" ");
        }
    }
}
