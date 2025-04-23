package sample;

public class java {

	public static void main(String[] args) {
String b="bhaskar";
String rev="";
char c;
for(int i=0;i<b.length();i++) {
	c=b.charAt(i);
	rev=c+rev;
}
System.out.println(rev);
	}
}
