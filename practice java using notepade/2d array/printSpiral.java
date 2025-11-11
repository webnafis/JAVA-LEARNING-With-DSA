class PrintSpiral{

public static void printSpiral(int matrix[][]){
int startR= 0;
int startC= 0;
int endR = matrix.length-1;
int endC = matrix[0].length-1;
while(startR <= endR && startC <= endC){
	for(int i = startC; i<=endC; i++){
		System.out.print(matrix[startR][i]+" ");
	}
	for(int i = startR+1; i<=endR; i++){
		System.out.print(matrix[i][endC]+" ");
	} 
if(startR < endR){
	for(int i = endC-1; i>=startC; i--){
		System.out.print(matrix[endR][i]+" ");
	} 
}
if(startC<endC){
	for(int i = endR-1; i>=startR+1; i--){
		System.out.print(matrix[i][startC]+" ");
	} 
}
	startR++;
	startC++;
	endR--;
	endC--;
}
System.out.println();
}

public static void main(String args[]){

	int SquareMatrix1[][] = {
	{1,2,3,4},
	{5,6,7,8},
	{9,10,11,12},
	{13,14,15,16}
};

System.out.println("SquareMatrix1");
printSpiral(SquareMatrix1);


	int nonSquareMatrix[][] = {
	{1,2,3,4},
	{5,6,7,8},
	{9,10,11,12}

};
System.out.println("nonSquareMatrix");
printSpiral(nonSquareMatrix);

	int SquareMatrix2[][] = {
	{1,2,3},
	{4,5,6},
	{7,8,9}

};
System.out.println("SquareMatrix2");
printSpiral(SquareMatrix2);

	int singleRowMatrix[][] = {
	{1,2,3}
};
System.out.println("singleRowMatrix");
printSpiral(singleRowMatrix);

	int singleColumnMatrix[][] = {
	{1},
	{2},
	{3}
};
System.out.println("singleColumnMatrix");
printSpiral(singleColumnMatrix);


}

} 