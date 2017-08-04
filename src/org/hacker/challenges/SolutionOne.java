package org.hacker.challenges;

public class SolutionOne {

	

	private static String userName;
	private static String password;

	
	public SolutionOne(String uNm, String pwd){
		userName = uNm;
		password = pwd;
	}
	public SolutionOne() {
	}
	public String getUserName() {
		return userName;
	}

	public static void setPassword(String password) {
		SolutionOne.password = password;
	}

	public static String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		SolutionOne.userName = userName;
	}
	
	public static void main(String[] args) {
		System.out.println(userName);
		SolutionTwo solTwo = new SolutionTwo();
	}

	/*private static int doPlaneSeating(int n, String s) {

		// 1. Find the no of seats reserved from 's'
		// 2. Find no. of seats reserved in each row
		// 3. Consider this as a N*3 matrix
		// if s as a,b,c group under one category
		// if s has def
		List<String> abcRows = new ArrayList<String>();
		List<String> defgRows = new ArrayList<String>();
		List<String> hjkRows = new ArrayList<String>();
		String[] strArr = s.split(" ");
		for (String seat : strArr) {
			if (seat.contains("A") || seat.contains("B") || seat.contains("C")) {
				abcRows.add(seat);
			} else if (seat.contains("H") || seat.contains("J") || seat.contains("K")) {
				hjkRows.add(seat);
			} else {
				defgRows.add(seat);
			}
		}
		int rowCol = n * 3;
		
		 for (int i = 1; i <= n; i++) {
			String seatRow = Integer.toString(i);
			boolean abcInd=false;
			boolean ghkInd=false;
			boolean defInd=false;
			 for (String abc : abcRows) {
				if ((abc.contains(seatRow + "A") || abc.contains(seatRow + "B") || abc.contains(seatRow + "C"))&&!abcInd) {
					rowCol--;
					abcInd=true;
					break;
				}
				 for (String defg : defgRows) {
					if ((defg.contains(seatRow + "D") || defg.contains(seatRow + "E") || defg.contains(seatRow + "F") || defg.contains(seatRow + "G")) && !defInd) {
						rowCol--;
						defInd=true;
						break;
					}
					 for (String hjk : hjkRows) {
						if ((hjk.contains(seatRow + "H") || hjk.contains(seatRow + "J") || hjk.contains(seatRow + "K")) &&!ghkInd ) {
							rowCol--;
							ghkInd=true;
							break;
						}
					}

				}
			}
		}
		if(s.isEmpty()){
			return 3*n;
		}else{
			return (rowCol);
		}
		
	}*/
}