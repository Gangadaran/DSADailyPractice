package dailyMorningProblems;

public class LC997_FindtheTownJudge {
	/*
	 * https://leetcode.com/problems/find-the-town-judge/
	 */

	public void example() {
		int n =3;
		int[][] trust = {{1,3},{2,3},{2,3}};
		//findJudge(n, trust);
	}

//	private int findJudge(int n, int[][] trust) {
//		  int k=trust.length;
//	        if(n==1){
//	            return n;
//	        }
//	        int[] arr=new int[n+1];
//	        for(int i=0; i<k; i++ ){
//	                arr[trust[i][0]]--;
//	                arr[trust[i][1]]++;
//	                }
//	        for(int i=0; i<arr.length; i++){
//	            if(arr[i]==n-1){
//	                return i;
//	            }
//	        }
//	        return -1;
//		
//	}
	
//	public int findJudge(int n, int[][] trust) {
//        int k=trust.length;
//        if(n==1){
//            return n;
//        }
//        int[] arr=new int[n+1];
//        for(int i=0; i<k; i++ ){
//                arr[trust[i][0]]--;
//                arr[trust[i][1]]++;
//                }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n-1){
//                return i;
//            }
//        }
//        return -1;
//    }

	
}
