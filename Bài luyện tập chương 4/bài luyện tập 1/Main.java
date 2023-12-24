public class Main {
    public static void main(String[] args)
    {
        Camsanh camsanh = new Camsanh("Camsanh", "TP.HCM", "20/02/2003",
                "15k", "2 Tan", "Vang dam") ;
        camsanh.Camsanh();
        camsanh.xuatCamsanh();
        System.out.println("<------------------------------------>");
        CamCaoPhong camCaoPhong = new CamCaoPhong("CamCaoPhong", "TP.HCM",
                "28/03/2003", "25k", "2 Tan", "Vang nhat" );
        camCaoPhong.CamCaoPhong();
        camCaoPhong.xuatCamCaoPhong();
        System.out.println("<------------------------------------>");
        Quatao quatao = new Quatao("qua tao", "TP.HCM", "25/06/2003", "20k","2 Tan");
        quatao.Tao();
        quatao.xuatTao();

    }
}