//Bug J3. Do not modify x at all.

class TestBugJ3 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f() {
	int x;
	int y;
	x = 5;
	y = 2;
	
	//the correct output of x should be 7, an incorrect compiler that does not modify it will remain 5
	x += y;
	
	return x;
    }

}

