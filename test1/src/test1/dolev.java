package test1;


public class dolev {

	//אני לא מצליח את הסעיף השני בשאלה אחת
	
	
	//שאלה 1 סעיף א
	
	
	public static String TheCheapestPath(Node[][] mat) {//o(n+m)*num_of_cheapest_path
//		cleanValue();
		int i=mat.length-1;
		int j=mat[0].length-1;
		String path ="";

		while(i>0&&j>0) {
			int left=mat[i][j-1].value+mat[i][j-1].right;
			int up= mat[i-1][j].value+mat[i-1][j].down; 
			if(left<up) {
				path="R"+path;
				j--;
			}
			else { // up<=right
				path="D"+path;
				i--;
			}
		}

		while(j>0) {
			path="R"+path;
			j--;

		}
		while(i>0) {

			path="D"+path;
			i--;

		}

		return path;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("dolev");
	}

}
