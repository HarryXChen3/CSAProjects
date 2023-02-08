package labs.arrays_2d;

public class Arrays2D {
    @SuppressWarnings("PointlessArithmeticExpression")
    public static void main(final String[] args) {
        System.out.println("Sam");

        int[][] sam = {{31,9,29,67,74},
                {65,23,72,83,28,36,82},
                {2,3,4,5,6,7}};

        System.out.println(sam[0][0]);          //line 1
        System.out.println(sam[1][2]);			//line 2
        System.out.println(sam[0][4]);			//line 3
        System.out.println(sam[1/2][4]);		      //line 4
        System.out.println(sam[1*1][3]);		      //line 5
        System.out.println(sam[0].length);		//line 6
        System.out.println(sam.length);		      //line 7
        System.out.println(sam[1].length);		//line 8
        System.out.println(sam[2][0]);			//line 9
        System.out.println(sam[2][4]);			//line 10
        System.out.println(sam[2].length);	      //line 11
        System.out.println(sam[1*2][5/2]);	      //line 12

        //this will throw an IndexOutOfBoundsException
        //System.out.println(sam[4][0]);             //line 13

        System.out.println("Matrix");

        int[][] matrix = new int[4][8];

        for(int row=0;row<matrix.length;row++) {
            for(int column=0;column<matrix[row].length;column++) {
                matrix[row][column]=row*column+column/2+row*(column+1);
            }
        }

        System.out.println(matrix[1][2]);			//line 1
        System.out.println(matrix[1][3]);			//line 2
        System.out.println(matrix[2][6]);			//line 3
        System.out.println(matrix[1][5]);			//line 4
        System.out.println(matrix[1][6]);			//line 5
        int val = matrix[2][0] + matrix[0][0];
        System.out.println( val );				//line 6
        System.out.println(matrix[2][2]);			//line 7
        val = matrix[2][5] - matrix[1][1];
        System.out.println( val );				//line 8
        System.out.println(matrix[2][7]);			//line 9
        System.out.println(matrix[2][5]);			//line 10
        val = matrix[3][6] / matrix[2][1];
        System.out.println( val );				//line 11
        val  = (matrix[1][1]+matrix[1][2])/3;
        System.out.println(matrix[ val ][ val ]);		//line 12
    }
}
