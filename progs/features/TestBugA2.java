// Bug A2. Return false when x is equal to y and true otherwise 

class TestBugA2 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f(){
	boolean x;
	boolean y;
	int a;
	x = false;
	y = false;
	a = 0;
	
	//A correct compiler would only return 1
	while(x == y){
		x = true;
		a = 1;
	}
	//If the compiler is incorrect, and x == y do not match and it incorrectly returns true...
	//... it would return 2;
	while(x == y){
		x = false;
		a = 2;
	}	
	return a;
	}

}
