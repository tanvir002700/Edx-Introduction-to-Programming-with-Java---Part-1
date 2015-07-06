class Peer{
	public double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n){

		/**
		* ret array store Final result
		* */
		double ret[] =new double[2];


		/*
		* H Array for snowshoe hare population
		* L Array for lynx population
		* */
		double H[] = new double [n+1];
		double L[] = new double [n+1];


		/*
		* Store initial population of both city
		* */
		H[0] = preyPred[0];
		L[0] = preyPred[1];


		double a1 = a[0];
		double a2 = a[1];

		double b1 = b[0];
		double b2 = b[1];

		for(int i=1 ; i<=n ; i++){
		H[i] = H[i-1] + a1 * H[i-1] - a2*H[i-1]*L[i-1]; 
		L[i] = L[i-1] - b1 * L[i-1] + b2*H[i-1]*L[i-1];
		}

		ret[0] = H[n];
		ret[1] = L[n];

		return ret;
		}
}

public class Xm1{
     public static void main (){
         
     }
}