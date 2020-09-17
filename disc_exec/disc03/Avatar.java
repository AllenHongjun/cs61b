public class Avatar{
	public static String electricity;
	public String fluid;

	public Avatar(String str1, String str2){
		Avatar.electricity = str1;
		this.fluid = str2;
	}

	public static void main(String[] args){
		Avatar foo1 = new Avatar("one ", "two");
		Avatar foo2 = new Avatar("three ", "four");
		System.out.println(foo1.electricity + foo1.fluid);
		// 静态变变量的值如果修改话。。那么所有实例化的对象的值 都是改变。。
		// 这个discuess 最好能够配置 视频 和 ppt 一起看。。 那个说的详细一些。。
		// 
		foo1.electricity = "I declare ";
		foo1.fluid = "a thumb war";
		System.out.println(foo2.electricity + foo2.fluid);
	}
}