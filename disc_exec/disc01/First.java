public class First{


	/*

	建立一个Dog 类为了能够正常运行代码
	-- 如果编译错误 运行 javac -encoding utf-8 First.java

	-- 内部这个类为什么一定加上static main编译才能通过
	https://blog.csdn.net/shengzhu1/article/details/71375028
	*/
	public static  class Dog{
		private String n;
		private Integer s;
		public Dog(String name, Integer size){
			this.n = name;
			this.s = size;
		}

		public void bark(Integer num){
			System.out.println("Dog bar:" + num);
		}

		public void play(){
			System.out.println("Dog is playing");
		}
	}



	public static void main(String[] args) {
		int size = 27; //Declares a variable of tyeo int and assigns it the value 27, In java, allviriables must be decalared before they are usred.

		System.out.println(size);


		String name = "Fido"; // Declares a variable of type String and assigns it the vairable "Fido";

		Dog myDog = new Dog(name, size); // Declares and initializes a new variable of type Dog, Calls the Dog constructor to create a new object of type Dog

		//Declares and initializes a new variable of type Dog, Calls
		// and assigns it the value 22
		// java -encoding utf-8 HelloWorld.java
		// java HelloWorld
		// javac HelloWorld.java  Test.java
		//多尝试几种命令 。。如果一种命令 不行的话。。
		int x = size - 5;  


		// If x is less than 15, calls the bark method on an instance of the Dog clss. Since x is 22, myDog.bark is not called
		if (x < 15) {
			myDog.bark(8);
		}

		// Checks if x is greater than 3 and if so calls myDog's play method. Subtracts 1, and so long as x is bigger than 3 , goes  back to the beginning of the loop. Play happens a total of 19 times.

		while(x > 3){
			x -= 1;
			myDog.play();
		}

		//Declares an array of ints and initializes it to {2, 3, 5, 7}
		int[] numList = {2, 4, 6, 8};

		// Prints the String "Hello" to the standard output
		System.out.print("Hello ");

		// Prints the String "Dog: Fido" to the standard output and then terminates the line

		System.out.println("Dog: " + name);

		// Prints the String "4" to the standard output and then terminates the line. In Java,, arrays are indexed from 0


		// numList[3] is equal to 8
		if (numList[3] == 8) {
			System.out.println("potato");

		}


		//============================================================
		System.out.println("============invoke-mystery======================");
		int[] inputArray = {3, 0, 4, 6, 3};
		Integer answer = mystery(inputArray, 0);
		System.out.println("answer: " + answer);

		System.out.println("=============invoke-mystery2================================");
		int[] inputArray2 = {3, 4, -1, 23, 0, 99, 12, 2, 9};
		mystery2(inputArray2);

		for(int item : inputArray2){
			System.out.println(item);
		}

		int fibN = fib(12);
		System.out.println("fibN: " + fibN);
		

	}


	/*
		It returns the index of the smallest elemtn that occurs at or after index k in the array
	  从 第k个元素开始查找 找出数组当中最小值的 索引。。
	  mystert([2,3,4,5,62,4,5], 2)
	  should be  4
	*/
	public static int mystery(int[] inputArray, int k){
		int x = inputArray[k];
		int answer = k;
		int index = k + 1;
		while(index < inputArray.length){
			if (inputArray[index] < x) {
				x = inputArray[index];
				answer = index;
			}
			index = index + 1;
		}

		return answer;

	}



	/*
	the method mystery2 sorts the elemnts of the array in increasing order
	selection sort..选择排序的算法。。。
	递归是一个树。。可以从cs61a  当中有详细的说明
	就是函数调用自身。。直到满足一个条件停止。

	*/
	public static void mystery2(int [] inputArray){
		int index = 0;
		while( index < inputArray.length){
			int targetIndex = mystery(inputArray, index);
			int temp = inputArray[targetIndex];
			inputArray[targetIndex] = inputArray[index];
			inputArray[index] = temp;
			index = index + 1;
		}
	}


	/*

	就这个序列的前n个数字的和。。如果要打印输出 ？？
	*/
	public static int fib(int n){

		System.out.println("fib---arg---n: " + n);
		if (n <= 1) {
			return n;
		}else{
			return fib(n - 1) + fib(n - 2);
		}
	}


	public static int fib2(int n, int k, int f0, int f1){
		if (n == k) {
			return f0;
		}else{
			return fib2(n, k + 1, f1, f0 + f1);
		}
	}



}