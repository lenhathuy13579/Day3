package model;


import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    static ArrayList<teacher> dsGV=new ArrayList<teacher>();
    static ArrayList<DanhSachHocPhan> dsHP=new ArrayList<DanhSachHocPhan>();
    static ArrayList<student> dsSV=new ArrayList<student>();
    public static void menu()
    {
        Scanner input = new Scanner(System.in);
        boolean stop = true;
        System.out.println("            MENU            ");
        System.out.println("1.Hiển thị danh sách sinh viên.");
        System.out.println("2.Hiển thị danh sách giáo viên.");
        System.out.println("3.Hiển thị lớp học.");
        System.out.println("4.Nhập hồ sơ sinh viên.");
        System.out.println("5.Nhập hồ sơ giáo viên");
        System.out.println("6.Sửa đổi thông tin.");
        System.out.println("7.Xóa hồ sơ sinh viên.");
        System.out.println("8.Sửa điểm học phần.");
        System.out.println("0.Thoát.");

        do {
            System.out.print("\n\nNhập lựa chọn: ");
            int choose;
            choose = Integer.valueOf(input.nextLine());
            switch (choose){
                case 1:
                    xuatSV();
                    break;
                case 2:
                    xuatGV();
                    break;
                case 3:
                    xuatLop();
                    break;
                case 4:
                    nhapSV();
                    break;
                case 5:
                    nhapGV();
                    break;
                case 6:
                    suaInfo();
                    break;
                case 7:
                    deleteinfo();
                    break;
                case 8:
                    suaDiem();
                    break;
                case 0:
                    stop = false;
                    break;
                default:
                    break;
            }
        } while (stop);
    }

    public static void main(String[] args) {
        menu();
    }
    public static void nhapSV()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần thêm: ");
        int soSinhVien = Integer.valueOf(input.nextLine());
        for (int j=0;j<soSinhVien;j++)
        {
            student sv = new student();
            System.out.println("Sinh viên thứ "+(j+1));
            System.out.print("Nhập mã sinh viên: ");
            String id= input.nextLine();
            System.out.print("Nhập mã lớp: ");
            String malop= input.nextLine();
            System.out.print("Nhập họ đệm: ");
            String hodem= input.nextLine();
            System.out.print("Nhập tên: ");
            String ten= input.nextLine();
            System.out.print("Nhập năm sinh: ");
            int namsinh= Integer.valueOf(input.nextLine());;
            System.out.print("Nhập giới tính :");
            String gioitinh = input.nextLine();
            int n;
            System.out.print("Nhập số học phần sinh viên đã học: ");
            n = Integer.valueOf(input.nextLine());
            ArrayList<hocphan> listHP = new ArrayList<hocphan>();
            for (int i=0;i<n;i++)
            {
                System.out.print("Nhập tên học phần"+" "+ (i+1)+" : ");
                String tenHP = input.nextLine();
                System.out.print("Nhập mã học phần: ");
                String maHP = input.nextLine();
                System.out.print("Nhập số tín chỉ: ");
                int soTin = Integer.valueOf(input.nextLine());
                System.out.print("Nhập điểm học phần: ");
                double diem = Double.valueOf(input.nextLine());
                hocphan mon = new hocphan(maHP,ten,soTin, diem);
                listHP.add(mon);
            }
            DanhSachHocPhan danhSachHocPhan = new DanhSachHocPhan(id, n, listHP);
            dsHP.add(danhSachHocPhan);
            sv.setMaSV(id);
            sv.setMaLop(malop);
            sv.setHoDem(hodem);
            sv.setName(ten);
            sv.setBirth(namsinh);
            sv.setGioiTinh(gioitinh);
            sv.setSoHocPhan(dsHP);
            dsSV.add(sv);
            System.out.println();
        }

    }
    public static void nhapGV()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số giáo viên cần thêm vào: ");
        int soGV = Integer.valueOf(input.nextLine());
        for (int j=0;j<soGV;j++) {
            teacher gv = new teacher();
            System.out.println("Giáo viên thứ: "+(j+1));
            System.out.print("Nhập mã giáo viên: ");
            String id = input.nextLine();
            System.out.print("Nhập mã lớp: ");
            String malop = input.nextLine();
            System.out.print("Nhập tên: ");
            String ten = input.nextLine();
            System.out.print("Nhập năm sinh: ");
            int namsinh = Integer.valueOf(input.nextLine());
            System.out.print("Nhập giới tính :");
            String gioitinh = input.nextLine();

            gv.setMaGV(id);
            gv.setMaLop(malop);
            gv.setName(ten);
            gv.setBirth(namsinh);
            gv.setGioiTinh(gioitinh);
            dsGV.add(gv);
            System.out.println();
        }
    }
    public static void suaInfo()
    {
        Scanner input = new Scanner(System.in);
        if (dsGV.size()==0 )
        {
            System.out.println("hiện chưa có giáo viên.");
        }
        if ( dsSV.size()==0 )
        {
            System.out.println("Hiện chưa có sinh viên.");
        }
        else
        {
            System.out.print("nhập mã của người mà bạn muốn sửa: ");
            String codeper = input.nextLine();
            for (int i=0;i<dsGV.size();i++) {
                if (codeper.equals(dsGV.get(i).getMaGV())) {
                    boolean check = true;
                    System.out.println("Chọn mục cần sửa:");
                    System.out.println("1.Tên.");
                    System.out.println("2.Năm sinh.");
                    System.out.println("3.Giới tính.");
                    System.out.println("0.Thoát.");
                    do {
                        System.out.printf("Nhập lựa chọn muốn sửa: ");
                        int choose = Integer.valueOf(input.nextLine());
                        switch (choose) {
                            case 1:
                                System.out.print("Sửa tên: ");
                                String name = input.nextLine();
                                dsGV.get(i).setName(name);
                                break;
                            case 2:
                                System.out.print("Sửa năm sinh: ");
                                int age = Integer.valueOf(input.nextLine());
                                dsGV.get(i).setBirth(age);
                                break;
                            case 3:
                                System.out.print("Sửa giới tính: ");
                                String gender = input.nextLine();
                                dsGV.get(i).setGioiTinh(gender);
                                break;
                            case 0:
                                System.out.println("Đã sửa xong.");
                                check = false;
                                break;
                            default:
                                break;
                        }
                    } while (check);
                }
            }
            for (int i=0;i<dsSV.size();i++) {
                if (codeper.equals(dsSV.get(i).getMaSV())) {
                    boolean check = true;
                    System.out.println("Chọn mục cần sửa:");
                    System.out.println("1.Tên.");
                    System.out.println("2.Năm sinh.");
                    System.out.println("3.Giới tính.");
                    System.out.println("4.Họ đệm");
                    System.out.println("0.Thoát.");
                    do {
                        System.out.printf("Nhập lựa chọn: ");
                        int choose = Integer.valueOf(input.nextLine());
                        switch (choose) {
                            case 1:
                                System.out.print("Sửa tên: ");
                                String name = input.nextLine();
                                dsSV.get(i).setName(name);
                                break;
                            case 2:
                                System.out.print("Sửa năm sinh: ");
                                int age = Integer.valueOf(input.nextLine());
                                dsSV.get(i).setBirth(age);
                                break;
                            case 3:
                                System.out.print("Sửa giới tính: ");
                                String gender = input.nextLine();
                                dsSV.get(i).setGioiTinh(gender);
                                break;
                            case 4:
                                System.out.print("Sửa họ đệm: ");
                                String hoDem = input.nextLine();
                                dsSV.get(i).setHoDem(hoDem);
                            case 0:
                                System.out.println("Đã sửa xong.");
                                check = false;
                                break;
                            default:
                                break;
                        }
                    } while (check);
                }
            }
        }
    }
    public static void  deleteinfo()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String codestud= input.nextLine();
        int check = 0;
        for(student sv: dsSV)
        {
            if(sv.getMaSV().equals(codestud))
            {
                dsSV.remove(sv);
                check = 1;
                break;
            }
        }
        if (check==0)
        {
            System.out.println("Sinh viên này không tồn tại");
        }
    }
    public static void  xuatSV()
    {
        if (dsSV.size() == 0)
            System.out.println("Hiện chưa có sinh viên.");
        else {
            for (int i = 0; i < dsSV.size(); i++) {
                System.out.println("Họ tên: "+ dsSV.get(i).getHoDem()+ " " + dsSV.get(i).getName());
                System.out.println("Năm sinh: " + dsSV.get(i).getBirth());
                System.out.println("Giới tính: " + dsSV.get(i).getGioiTinh());
                System.out.println("Mã sinh viên: " + dsSV.get(i).getMaSV());
                System.out.println("Mã lớp: " + dsSV.get(i).getMaLop());
                int tongTin=0 ;
                double sum=0 ;
                for(int j=0 ; j<dsHP.get(i).getSoHP() ; j++){
                    sum = sum + dsHP.get(i).getHocPhan().get(j).getDiemEnd()
                            * dsHP.get(i).getHocPhan().get(j).getTinChi() ;
                    tongTin = tongTin + dsHP.get(i).getHocPhan().get(j).getTinChi();
                }
                System.out.println("điểm tổng trung bình: "+(sum/tongTin));
                System.out.println();
            }
        }
    }
    public static void suaDiem()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên muốn sửa: ");
        String maSV = input.nextLine();
        int check = 0;
        for (int i=0;i<dsSV.size();i++)
        {
            if (maSV.equals(dsHP.get(i).getMaSv()))
            {
                System.out.println("(bấm 0 để thoát nếu đã sửa xong hoặc không muốn sửa)");
                System.out.print("Nhập học phần muốn sửa: ");
                String idHP = input.nextLine();
                if (idHP.equals("0"))
                {
                    break;
                }
                for (int j=0;j<dsHP.get(i).getSoHP();j++)
                {
                    if (idHP.equals(dsHP.get(i).getHocPhan().get(j).getMaHocPhan()))
                    {
                        System.out.print("Nhập điểm sửa: ");
                        int newMark = Integer.valueOf(input.nextLine());
                        dsHP.get(i).getHocPhan().get(j).setDiemEnd(newMark);
                        check = 1;
                        break;
                    }
                }
            }
            if (check == 0)
            {
                System.out.println("Không tìm thấy sinh viên này");
            }
        }

    }
    public static void xuatGV()
    {
        if (dsGV.size() == 0)
            System.out.println("Hiện chưa có giáo viên");
        else {
            for (int i = 0; i < dsGV.size(); i++) {
                System.out.println("Họ tên: " + dsGV.get(i).getName());
                System.out.println("Năm sinh: " + dsGV.get(i).getBirth());
                System.out.println("Giới tính: " + dsGV.get(i).getGioiTinh());
                System.out.println("Mã giáo viên: " + dsGV.get(i).getMaGV());
                System.out.println("Mã lớp: " + dsGV.get(i).getMaLop());
                System.out.println();
            }
        }
    }
    public static void  xuatLop()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");
        String codeClass = input.nextLine();
        System.out.println("Danh sách của lớp: "+ codeClass);
        if (dsGV.size() ==0 )
        {
            System.out.println("Chưa có giáo viên trong lớp.");
        }
        else {
            System.out.println("Giáo viên: ");
            for (int i=0;i< dsGV.size();i++) {
                if (codeClass.equals(dsGV.get(i).getMaLop()))
                {
                    System.out.println(dsGV.get(i).getName());
                }
            }
        }
        if (dsSV.size()==0)
        {
            System.out.println("Chưa có sinh viên trong lớp.");
        }
        else {
            System.out.println("Sinh viên:");
            for (int i=0;i< dsSV.size();i++) {
                if (codeClass.equals(dsSV.get(i).getMaLop()))
                {
                    System.out.println(dsSV.get(i).getHoDem()+" "+dsSV.get(i).getName());
                }
            }
        }
    }
}
