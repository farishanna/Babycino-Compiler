//Bug J1. Allow y to be a boolean expression.

class TestBugJ1 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f() {
	int x;
	int y;
	boolean bool;
	x = 0;
	y = 1;
	bool = true;
	
	//if it compiles correctly, then below should return 1
	x += y;
	
	//otherwise, if you uncomment below, you will recieve an error message
	//x += bool;
	return x;
    }

}

