//Bug A1. Allow comparison of integers with booleans 

class TestBugA1 {
    public static void main(String[] a) {
	System.out.println(new Test().f());
    }
}

class Test {

    public int f(){
	int x;
	int y;
	boolean bool;
	x = 6;
	y = 6;
	bool = false;
	
	//If the compiler is correct, then it should return 10 as an output
	while(x == y){ //proves can compare two ints
		while(bool == false){ //proves can compare two booleans while proving to compare two ints
			x = 10;
			bool = true;
		}	
	}
	
	//uncomment below to see the result if two unmatching arguments get compared
	//while(x == bool){
	//	x = 5;
	//}	
	
	return x;
    }
}

