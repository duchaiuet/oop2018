package week4.task1;

public class Test {
    public static void main(String[]args){
    	Cam_sanh vd1 = new  Cam_sanh();
    	Cam_thanh_phong vd2 = new Cam_thanh_phong();
    	Tao vd3 = new Tao();
    	Cam vd4 = new Cam();
    	HoaQua vd5 = new HoaQua();
// Test class Cam_sanh
    	vd1.setGia(10000);
    	vd1.setThuoctinh("Hàn");
    	vd1.setMien("Miền Bắc");
    	vd1.setNgaynhap("10/10/2018");
    	vd1.setNguon("Hà Giang");
    	vd1.setSoluong(2);
    	vd1.setTen("Cam sành");
    	vd1.Thongtin();
 // Test class Cam_thanh_phong
    	System.out.println("\n");
    	vd2.setGia(15000);
    	vd2.setThuoctinh("Hàn");
    	vd2.setMien("Miền Nam");
    	vd2.setNgaynhap("11/10/2018");
    	vd2.setNguon("Thanh Phong");
    	vd2.setSoluong(5);
    	vd2.setTen("Cam Thanh Phong");
    	vd2.Thongtin();
// Test class Tao
    	System.out.println("\n");
    	vd3.setThuoctinh("Nhiệt");
    	vd3.setMien("Miền Bắc");
    	vd3.setNgaynhap("12/10/2018");
    	vd3.setTen("Táo");
    	vd3.Thongtin();
// Tes class Cam   	
    	System.out.println("\n");
    	vd4.setThuoctinh("Hàn");
    	vd4.setMien("Miền Nam");
    	vd4.setNgaynhap("11/10/2018");
    	vd4.setTen("Cam");
    	vd4.Thongtin();
// Test class HoaQua    	
    	System.out.println("\n");
    	vd5.setMien("Miền trung");
    	vd5.setThuoctinh("Nhiệt");
    	vd5.Thongtin();
    }
}