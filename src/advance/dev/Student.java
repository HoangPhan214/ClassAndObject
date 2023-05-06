package advance.dev;

public class Student {
	String name;
	int tuoi;
	String diaChi;
	String soDienThoai;
	double diemTrungBinh;
	
	public Student(String name, int tuoi, String diaChi, String soDienThoai, double diemTrungBinh) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	
	
	
}
