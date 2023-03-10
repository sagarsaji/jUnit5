package ustbatchno3.junit5testcases;



public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "Finla";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
