class SearchSortedMatrix{

public static void staircaseSearch(int matrix[][], int key){
	int i = 0, j = matrix[0].length-1;
	while(i < matrix.length && j>=0){
		if(matrix[i][j] == key){
			System.out.println("(" + i+ " , " +j+")");
			return;

		}else if(matrix[i][j] < key){
			i++;
		}else{

			j--;
		}
	}
System.out.println("Key not found!");
return;
	
}

public static void staircaseSearch2(int matrix[][], int key){
	int i =  matrix.length-1, j = 0;
	while(i >= 0 && j< matrix[0].length){
		if(matrix[i][j] == key){
			System.out.println("(" + i+ " , " +j+")");
			return;

		}else if(matrix[i][j] < key){
			j++;
		}else{
			i--;

		}
	}
System.out.println("Key not found!");
return;
	
}

 
public static void main(String args[]){ // sorted both row and collumn wise

int smatrix[][]={
{10, 20, 30, 40},
{15, 25, 35, 45},
{27, 29, 37, 48},
{32, 33, 39, 50}
};

staircaseSearch(smatrix, 32);
staircaseSearch(smatrix, 40);
staircaseSearch(smatrix, 10);
staircaseSearch(smatrix, 50);
staircaseSearch(smatrix, 5);
staircaseSearch2(smatrix, 32);
staircaseSearch2(smatrix, 40);
staircaseSearch2(smatrix, 10);
staircaseSearch2(smatrix, 50);
staircaseSearch2(smatrix, 5);


}
}