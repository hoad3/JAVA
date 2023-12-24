import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    private static ArrayList<PhongLyThuyet> list1 = new ArrayList<PhongLyThuyet>();
    private static ArrayList<PhongMayTinh> list2 = new ArrayList<PhongMayTinh>();
    private static ArrayList<PhongThiNgiem> list3 = new ArrayList<PhongThiNgiem>();

    public QuanLy() {

    }

    public ArrayList<PhongLyThuyet> getList1() {
        return list1;
    }

    public void setList1(ArrayList<PhongLyThuyet> list1) {
        this.list1 = list1;
    }

    public ArrayList<PhongMayTinh> getList2() {
        return list2;
    }

    public void setList2(ArrayList<PhongMayTinh> list2) {
        this.list2 = list2;
    }

    public ArrayList<PhongThiNgiem> getList3() {
        return list3;
    }

    public void setList3(ArrayList<PhongThiNgiem> list3) {
        this.list3 = list3;
    }

    public void ThemPhongHoc() {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "\n(1: phong ly thuyet, " +
                        "\n2: phong may tinh, " +
                        "\n3: phong thi nghiem, " +
                        "\n4: xem thong tin, " +
                        "\n5: xoa thong tin): ");


        int loai = sc.nextInt();

        PhongLyThuyet PLT = new PhongLyThuyet();
        PhongMayTinh PMT = new PhongMayTinh();
        PhongThiNgiem PTN = new PhongThiNgiem();

        if (loai == 1) {
            if (list1.isEmpty()) {
                System.out.println("Không có thông tin phòng ly thuyet.");
            }
            PLT = new PhongLyThuyet();
            PLT.NhapLT();
            list1.add(PLT);
            setList1(list1);
        } else if (loai == 2) {
            if (list2.isEmpty()) {
                System.out.println("Không có thông tin phòng máy tính.");
            }
            PMT = new PhongMayTinh();
            PMT.NhapMT();
            list2.add(PMT);
            setList2(list2);
        } else if (loai == 3) {
            if (list3.isEmpty()) {
                System.out.println("Không có thông tin phòng thi nghiem.");
            }
            PTN = new PhongThiNgiem();
            PTN.NhapTN();
            list3.add(PTN);
            setList3(list3);
        } else if (loai == 4) {

            XemThongTin();
        } else if (loai == 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã phòng cần xóa: ");
            String maPhong = scanner.nextLine();
            XoaThongTinPhong(maPhong);
            System.out.println("Thông tin phòng đã được xóa.");
        }

    }

    public void XemThongTin() {
        System.out.println("===========================================");
        System.out.println("               PHÒNG LÝ THUYẾT              ");
        System.out.println("===========================================");
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s\n", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Máy chiếu");
        System.out.println("-------------------------------------------");
        for (PhongLyThuyet PLT : getList1()) {
            System.out.printf("\n%15s | %15s | %15s | %15d | %15s", PLT.MaPhong, PLT.DayNha, PLT.DienTich, PLT.SoBongDen, PLT.MayChieu);
        }
        System.out.println("\n\n===========================================");
        System.out.println("               PHÒNG MÁY TÍNH               ");
        System.out.println("===========================================");
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s\n", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Máy tính");
        System.out.println("-------------------------------------------");
        for (PhongMayTinh PMT : getList2()) {
            System.out.printf("\n%15s | %15s | %15s | %15d | %15s", PMT.MaPhong, PMT.DayNha, PMT.DienTich, PMT.SoBongDen, PMT.MayTinh);
        }
        System.out.println("\n\n===========================================");
        System.out.println("              PHÒNG THÍ NGHIỆM              ");
        System.out.println("===========================================");
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s\n", "Mã phòng", "Dãy nhà", "Diện tích", "Số bóng đèn", "Sức chứa", "Bồn rửa");
        System.out.println("-------------------------------------------");
        for (PhongThiNgiem PTN : getList3()) {
            System.out.printf("\n%15s | %15s | %15s | %15d | %15d | %15s", PTN.MaPhong, PTN.DayNha, PTN.DienTich, PTN.SoBongDen, PTN.SucChua, PTN.BonRua);
        }
    }

    public void XoaThongTinPhong(String maPhong) {
        for (PhongLyThuyet PLT : list1) {
            if (PLT.getMaPhong().equals(maPhong)) {
                list1.remove(PLT);
                break;
            }
        }

        for (PhongMayTinh PMT : list2) {
            if (PMT.getMaPhong().equals(maPhong)) {
                list2.remove(PMT);
                break;
            }
        }

        for (PhongThiNgiem PTN : list3) {
            if (PTN.getMaPhong().equals(maPhong)) {
                list3.remove(PTN);
                break;
            }
        }
    }

    public void XapXep_DayNha() {
        System.out.println("\n1.xap xep phong ly thuyet \n2.xap xep may tinh \n3.xap xep phong thi nghiem");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        if (chon == 1) {
            Collections.sort(list1, new Comparator<PhongLyThuyet>() {
                @Override
                public int compare(PhongLyThuyet p1, PhongLyThuyet p2) {
                    return p1.getDayNha().compareTo(p2.getDayNha());
                }
            });
        } else if (chon == 2) {
            Collections.sort(list2, new Comparator<PhongMayTinh>() {
                @Override
                public int compare(PhongMayTinh p1, PhongMayTinh p2) {
                    return p1.getDayNha().compareTo(p2.getDayNha());
                }
            });
        } else if (chon == 3) {
            Collections.sort(list3, new Comparator<PhongThiNgiem>() {
                @Override
                public int compare(PhongThiNgiem p1, PhongThiNgiem p2) {
                    return p1.getDayNha().compareTo(p2.getDayNha());
                }
            });
        }
    }

    public void SapXepGiamTheoDienTich() {
        System.out.println("\n1.xap xep phong ly thuyet \n2.xap xep may tinh \n3.xap xep phong thi nghiem");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        if (chon == 1) {
            Collections.sort(list1, new Comparator<PhongLyThuyet>() {
                @Override
                public int compare(PhongLyThuyet p1, PhongLyThuyet p2) {
                    return Integer.compare((int) p2.getDienTich(), (int) p1.getDienTich());
                }
            });
        }
        if (chon == 2) {
            Collections.sort(list2, new Comparator<PhongMayTinh>() {
                @Override
                public int compare(PhongMayTinh p1, PhongMayTinh p2) {
                    return Integer.compare((int) p2.getDienTich(), (int) p1.getDienTich());
                }
            });
        }
        if (chon == 3) {
            Collections.sort(list3, new Comparator<PhongThiNgiem>() {
                @Override
                public int compare(PhongThiNgiem p1, PhongThiNgiem p2) {
                    return Integer.compare((int) p2.getDienTich(), (int) p1.getDienTich());
                }
            });
        }
    }
    
}
