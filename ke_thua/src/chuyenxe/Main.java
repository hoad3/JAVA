package chuyenxe;

import java.util.Scanner;

class ChuyenXe
{
   private String masochuyen;
   private String soxe;
   private String  hotenTaiXe;

   public ChuyenXe(String masochuyen,String soxe, String hotenTaiXe)
   {
       this.masochuyen = masochuyen;
       this.hotenTaiXe = hotenTaiXe ;
       this.soxe = soxe;
   }
   public String getMasochuyen()
   {
       return masochuyen;
   }
   public void setMasochuyen(String masochuyen)
   {
       this.masochuyen = masochuyen;
   }
   public String getHotenTaiXe()
   {
       return hotenTaiXe;
   }
   public void setHotenTaiXe(String hotenTaiXe)
   {
       this.hotenTaiXe = hotenTaiXe;
   }
   public String getSoxe()
   {
       return soxe;
   }
   public void setSoxe()
   {
       this.soxe = soxe;
   }

}
 class XeNT extends ChuyenXe()
{

}
public class Main
{
    public static void main(String[] args) {
        XeNT xeNT = new XeNT();

    }
}