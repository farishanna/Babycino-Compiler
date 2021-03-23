// Bug A3. == has lower precedence than &&

class TestBugA3 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f(){
	int x;
	int y;
	x = 0;
	y = 1;
	
	//A correct compiler would return 1 since it first evaluates lets say a=(x==0) then b=(y==1)...
	//...and then it modifies a && b 
	while (x == 0 && y == 1) {
		x = 1;
	}
	//otherwise, an incorrect compiler would first evaluate (0 && y), then it would ...
	//... compare "(0&&y) == x" and "(0&&y) == 1", which is wrong and will give an error
	
	return x;
	}
}
