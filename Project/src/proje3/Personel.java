
package proje3;

public class Personel {
   
 private int EID;
 private String PASSWORD;
 private String NAMESURNAME;
 private String TCNO;
 private String EMAIL;
 private String TELNR;
 private String ADRESS; 

    public Personel(int EID, String PASSWORD, String NAMESURNAME, String TCNO, String EMAIL, String TELNR, String ADRESS) {
        this.EID = EID;
        this.PASSWORD = PASSWORD;
        this.NAMESURNAME = NAMESURNAME;
        this.TCNO = TCNO;
        this.EMAIL = EMAIL;
        this.TELNR = TELNR;
        this.ADRESS = ADRESS;
    }

    public int getEID() {
        return EID;
    }

    public void setEID(int EID) {
        this.EID = EID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getNAMESURNAME() {
        return NAMESURNAME;
    }

    public void setNAMESURNAME(String NAMESURNAME) {
        this.NAMESURNAME = NAMESURNAME;
    }

    public String getTCNO() {
        return TCNO;
    }

    public void setTCNO(String TCNO) {
        this.TCNO = TCNO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTELNR() {
        return TELNR;
    }

    public void setTELNR(String TELNR) {
        this.TELNR = TELNR;
    }

    public String getADRESS() {
        return ADRESS;
    }

    public void setADRESS(String ADRESS) {
        this.ADRESS = ADRESS;
    }
 
 
 
 
 
}
