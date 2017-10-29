package combination;

import java.util.Scanner;

import combination.Combination_lib;

public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("input Number s> ");
		int s = Integer.parseInt(scan.next());
		
		System.out.print("input Number r> ");
		int r = Integer.parseInt(scan.next());

		Combination_lib clib = new Combination_lib();
		System.out.println(s+"!="+clib.getFactorian(s));
		System.out.println(s+"C"+r+"="+clib.getFactorian(s)/(clib.getFactorian(r)*clib.getFactorian(s-r)));
	}

}
