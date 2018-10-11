package week4.task1;

public class Tao extends HoaQua{
	protected String Ten;
	protected String Ngay_nhap;
	/**
	 * hàm khởi tạo mặc định
	 */
	public Tao() {}
	/**
	 * hàm lấy giá trị tên 
	 * @param Ten tên
	 */
	public void setTen(String Ten)
	{
		this.Ten = Ten;
	}
	
	/**
	 * hàm trả về giá trị tên
	 * @return tên
	 */
	public String getTen()
	{
		return this.Ten;
	}
	/**
	 * hàm lấy giá trị ngày nhập 
	 * @param Ngay ngày nhập
	 */
	public void setNgaynhap(String Ngay)
	{
		this.Ngay_nhap = Ngay;
	}
	/**
	 * hàm lấy giá trị ngày nhập
	 * @return ngày nhập
	 */
	public String getNgaynhap()
	{
		return this.Ngay_nhap;
	}
	/* (non-Javadoc)
	 * @see week4.task1.HoaQua#Thongtin()
	 * hàm xuât ra thông tin của thông tin
	 */
	public void Thongtin()
	{
		super.Thongtin();
		System.out.println("Ten loai qua: "+ this.Ten);
		System.out.println("Ngày nhập:"+this.Ngay_nhap);
	}
}
