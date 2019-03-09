package lab_5;

public class lab5_7 {
	  public static boolean isUpperTriangular(double[][] array) {
	        for(int x = 0; x < array.length; ++x) {
	            for(int n = 0; n < array[x].length; ++n) {
	                if(x > n && array[x][n] != 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        System.out.println(isUpperTriangular(new double[][] {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}}));
	        System.out.println(isUpperTriangular(new double[][] {{2, 1, 4}, {0, 3, -1}, {1, 2, -2}}));
	    }
}
