package Bai2;

import java.util.*;

public class HoTen {
    List<String> list = new ArrayList<>();

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ho va ten");
        String hoVaTen = scanner.nextLine();
        list.add(hoVaTen);
    }
    public void xuat(){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public void ngaunhien(){
        Collections.shuffle(list);
    }
    public void sapxep(){
        Collections.sort(list);
        Collections.reverse(list);
    }
    public void xoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ho va ten");
        String hoVaTen = scanner.nextLine();
        list.remove(hoVaTen);
    }
}
