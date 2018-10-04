//package week1;
//
//import java.util.*;
//
//public class StudentManagement {
//
//    static Scanner sc = new Scanner(System.in);
//     // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
//	static Student[] list = new Student[10];
//	static int n = list.length;
//    public static  boolean sameGroup(Student s1, Student s2) {
//        // TODO:
//        if ( s1.Group.equals(s2.Group)) return true;
//        else return false; // xóa dòng này sau khi cài đặt
//    }
//
//     static void studentsByGroup() {
//        // TODO:
//    	HashSet<String> hs = new HashSet<String>();
//    	for ( int i = 0; i < n ; i ++)
//    	{
//    		hs.add(list[i].Group);
//    	}
//    	String [] arr = new String[hs.size()];
//    	hs.toArray(arr);
//    	for ( int i = 0 ; i < hs.size(); i ++)
//    	{
//    		System.out.print("             "+arr[i]+" \n");
//    		for ( int j = 0 ; j < n; j ++)
//    		{
//    			if(arr[i].equals(list[j].Group)) list[j].getInfo();
//    		}
//    	}
//    	}
//
//    public static void removeStudent(String id) {
//        // TODO:
//    for ( int i = 0 ; i < n;i ++)
//    {
//    	if (id.equals(list[i].Id))
//    	{
//    		for ( int j = i; j<n-1;j++)
//    		{
//    			list[j] = list[j+1];
//    		}
//    		n--;
//    	}
//    }
//    }
//    public static void main(String[] args) {
//        // TODO:
//    	String a;
////        Student persion1 = new Student();
////        Student persion2 = new Student("ND Hai","17020705","17020705@vnu.edu.vn");
////        persion1.Name = "Nguyen Duc Hai";
////        persion1.Id = "17020715";
////        persion1.Email = "17020715@vnu.edu.com";
////        persion1.Group = "INT22041";
////        Student persion3 = new Student(persion1);
////        persion3.Group = "INT22042";
////        // print name:
////        System.out.println("Name: "+persion1.Name);
////        persion1.getInfo();
////        //check Group:
////        System.out.println("Same Group: "+sameGroup(persion1,persion2));
//        list[0] = new Student("hai","1","hai@vnu");
//        list[1] = new Student("hai","2","hai@vnu");
//        list[2] = new Student("hai","3","hai@vnu");
//        list[3] = new Student("hai","4","hai@vnu");
//        list[4] = new Student("hai","5","hai@vnu");
//        list[5] = new Student("hai","6","hai@vnu");
//        list[5].setGroup("INT22042");
//        list[6] = new Student("hai","7","hai@vnu");
//        list[6].setGroup("INT22042");
//        list[7] = new Student("hai","8","hai@vnu");
//        list[7].setGroup("INT22042");
//        list[8] = new Student("hai","9","hai@vnu");
//        list[8].setGroup("INT22043");
//        list[9] = new Student("hai","10","hai@vnu");
//        list[9].setGroup("INT22043");
//        Test1.studentsByGroup();
//        System.out.print("remove the student: ");
//        a = sc.nextLine();
//        removeStudent(a);
//        for(int i = 0; i < n ; i ++)
//        {
//        	list[i].getInfo();
//        }
//    }
//
//}
