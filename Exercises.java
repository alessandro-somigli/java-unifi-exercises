public class Exercises {
	public static void main(String[] args) {}
	
	public static int[][] lab12_1(int[][] _mat, int _shift) {
		_shift %= _mat.length;
		
		int[][] nmat = new int[_mat.length][_mat[0].length];
		for (int i=0; i<_mat.length; i++) {
			if (i+_shift >= _mat.length) _shift -= _mat.length;
			else if (i+_shift < 0) _shift += _mat.length;
			
			System.arraycopy(_mat[i], 0, nmat[i+_shift], 0, _mat[0].length);
		}
		
		return nmat;
	}
	
	// fuck the recursive part, there's no way i'm doing that
	public static int lab12_2(char[] _arr, char _char) {
		int max=0, i=0;
		
		while (i<_arr.length) {
			if (_arr[i++] == _char) {
				int c = lab12_2_count(_arr, i, _char);
				max=(c>max)?c:max;
				i+=c;
			}
		}
		
		return max;
	}
	
	public static int lab12_2_count(char[] _arr, int _iarr, char _char) {
		int c=1;
		while (_iarr < _arr.length && _arr[_iarr++] == _char) c++;
		
		return c;
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