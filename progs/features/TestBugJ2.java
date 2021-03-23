//Bug J2. Instead of assigning x + y to x, assign y to x.

class TestBugJ2 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f() {
	int x;
	int y;
	int res;
	x = 5;
	y = 2;
	
	x += y; //x should return 7
	
	//res will subtract x - y, if it a correct compiler, res should return 5, as (5+2) - 2 = 5
	//otherwise, if it was an incorrect compiler, and x += y assigned to y, then res would return -2, as 5 - (5+2) = -2
	res = x - y;
	
	return res;
    }

}

