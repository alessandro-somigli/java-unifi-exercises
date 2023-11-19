public class Exercises {
	public static void main(String[] args) {
		// Exercises.invoke("lab13_1", 9180, 937829, 913803, 212801);
		
		// lab13_1
		int lab13_1 = lab13_1(937829, 913803, 212801);
		System.out.println("lab13_1: " + lab13_1);
		
		// lab13_2
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] mod = {{1,0,2},{0,2,1}};
		mat = Exercises.lab13_2(mat, mod);
		
		System.out.println("lab13_2: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[0].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.print("\n");
		}System.out.print("\n");
	}
	
	public static int lab13_1(int n1, int n2, int n3) {
		if (n1 == 0 && n2 == 0 && n3 == 0) return 0;
		else if (n1%10 == n2%10 || n1%10 == n3%10)
			return lab13_1(n1/10, n2/10, n3/10)*10 + n1%10;
		else if (n2%10 == n3%10)
			return lab13_1(n1/10, n2/10, n3/10)*10 + n2%10;
		else return lab13_1(n1/10, n2/10, n3/10);
	}
	
	public static int[][] lab13_2(int [][] _mat, int[][] _mod) {
		int[][] vnmat = new int[_mat.length][_mat.length];
		vnmat = lab13_2_vert_shuff(_mat, vnmat, _mod, 0);
		
		int[][] hnmat = new int[_mat.length][_mat.length];
		hnmat = lab13_2_horiz_shuff(vnmat, hnmat, _mod, 0);
		
		return hnmat;
	}
	
	public static int[][] lab13_2_vert_shuff(int [][] _mat, int[][] _nmat, int[][] _mod, int _imod) {
		if (_imod >= _mod.length) return _mat;
		int[] shuff = _mod[_imod];
		
		for (int i=0; i<shuff.length; i++)
			for (int j=0; j<_nmat.length; j++)
				_nmat[j][shuff[i]] = _mat[j][i];
		
		return lab13_2_vert_shuff(_nmat, _mat, _mod, ++_imod);
	}
	
	public static int[][] lab13_2_horiz_shuff(int [][] _mat, int[][] _nmat, int[][] _mod, int _imod) {
		if (_imod >= _mod.length) return _mat;
		int[] shuff = _mod[_imod];
		
		for (int i=0; i<shuff.length; i++)
			for (int j=0; j<_nmat.length; j++)
				_nmat[shuff[i]][j] = _mat[i][j];
		
		return lab13_2_horiz_shuff(_nmat, _mat, _mod, ++_imod);
	}
}