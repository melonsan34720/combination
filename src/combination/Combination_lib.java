package combination;

public class Combination_lib {

	public int getFactorian(int n) { //n�̊K����v�Z
		int f = 1;
			for(int i = 1; i <= n; i++) 
				f = f * i;
		return f;
	}
}
