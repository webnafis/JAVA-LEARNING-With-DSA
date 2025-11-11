class DiagonalSum{

public static int diagonalSum(int matrix[][]){ // must have to be square 
/*
int sum = 0;
	for(int i = 0; i<matrix.length; i++){
		sum += matrix[i][i];
	}
	for(int i = 0, j =matrix.length-1 ; i<matrix.length; i++, j--){
		sum += matrix[i][j];
	}
if(matrix.length%2 != 0){
	sum -= matrix[(int)matrix.length/2][(int)matrix.length/2];
}
*/

int sum = 0;
	for(int i = 0; i<matrix.length; i++){
		sum += matrix[i][i];
		sum += matrix[i][matrix.length - i - 1];
	}
  
if(matrix.length%2 != 0){
	sum -= matrix[(int)matrix.length/2][(int)matrix.length/2];
}

return sum;

}



public static void main(String args[]){

	int SquareMatrix1[][] = {
	{1,2,3,4},
	{5,6,7,8},
	{9,10,11,12},
	{13,14,15,16}
};

System.out.println("SquareMatrix1 " + diagonalSum(SquareMatrix1));


	int SquareMatrix2[][] = {
	{1,2,3},
	{4,5,6},
	{7,8,9}

};

System.out.println("SquareMatrix2 " + diagonalSum(SquareMatrix2));



}

} 