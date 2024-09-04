
//定义一个 叫XX的公开类
public class HelloWorld {

	static void print(int nums) {
        for (int i = 31; i >= 0; i--) {
            System.out.print( (nums & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
	
	// 定义一个公开的静态主方法
	public static void main(String[] args) {

		int a = 1;
		// 0000000001 
		 
		// print(a);
		System.out.print(a >> 2);
	}
	/*


	*/
}
