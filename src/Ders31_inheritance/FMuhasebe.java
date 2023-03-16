package Ders31_inheritance;

public class FMuhasebe extends EPersonel{
    String sgkNo= "Calisan sgk no belirtilmedi";
    boolean raporluMu;


    public void fazlaMesai(int fazlaMesaiSaati){
        System.out.println(fazlaMesaiSaati*200);
    }
    public void nobetUcreti(int nobetsayisi){
        System.out.println(nobetsayisi*500);
    }

}
