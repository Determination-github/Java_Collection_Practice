package managegrade;

public class MManageGrade {
	
	private int total;
	private float avg;
	private int[][] array;

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public void CalTotal(int num1, int num2, int num3) { //합계 구하기 메소드
			total = num1+num2+num3;
			setTotal(total);
	}
	
	
	public void CalAvg(int total) { //평균 구하기 메소드
		avg = getTotal()/3.0f;
		setAvg(avg);
	}
	
	
}
