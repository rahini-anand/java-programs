package oper_matrix;

public interface Oper_Matrix {
	public int sum();
	public int sum_row(int n);
	public int sum_col(int n);
	public int big();
	public int big_row(int n);
	public int big_col(int n);
	public int small();
	public int small_row(int n);
	public int small_col(int n);
	public boolean find_presense(int n);
}
