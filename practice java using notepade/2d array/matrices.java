import java.util.*;
class Matrices{

public static void search(int matrix[][], int key){
for(int i = 0; i <matrix.length; i++){

for(int j = 0; j< matrix[0].length; j++){
if(matrix[i][j] == key){
System.out.println("key found. Index: n = " + i+ " and m = " + j);
return;
}
}

}
System.out.println("key not found.");
}

public static void main(String args[]){
/*
int matrix[][] = new int[3][3];
int n = matrix.length, m = matrix[0].length;
Scanner sc = new Scanner(System.in);
for(int i = 0; i <n; i++){

	for(int j = 0; j< m; j++){
		matrix[i][j] = sc.nextInt();
	}

}

for(int i = 0; i <n; i++){

	for(int j = 0; j< m; j++){
		System.out.print(matrix[i][j] + " ");
	}
System.out.println();
}
*/
int matrix[][] = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
search(matrix, 9);
}
}