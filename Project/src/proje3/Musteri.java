
package proje3;

public class Musteri {
  
 private int CID;
 private String PASSWORD;
 private String NAMESURNAME;
 private String TCNO;
 private String EMAIL;
 private String CREATEDDATE;
 private String TELNR;
 private int USERID;
 private String ADRESS; 

    public Musteri(int CID, String PASSWORD, String NAMESURNAME, String TCNO, String EMAIL, String CREATEDDATE, String TELNR, int USERID, String ADRESS) {
        this.CID = CID;
        this.PASSWORD = PASSWORD;
        this.NAMESURNAME = NAMESURNAME;
        this.TCNO = TCNO;
        this.EMAIL = EMAIL;
        this.CREATEDDATE = CREATEDDATE;
        this.TELNR = TELNR;
        this.USERID = USERID;
        this.ADRESS = ADRESS;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
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

    public String getCREATEDDATE() {
        return CREATEDDATE;
    }

    public void setCREATEDDATE(String CREATEDDATE) {
        this.CREATEDDATE = CREATEDDATE;
    }

    public String getTELNR() {
        return TELNR;
    }

    public void setTELNR(String TELNR) {
        this.TELNR = TELNR;
    }

    public int getUSERID() {
        return USERID;
    }

    public void setUSERID(int USERID) {
        this.USERID = USERID;
    }

    public String getADRESS() {
        return ADRESS;
    }

    public void setADRESS(String ADRESS) {
        this.ADRESS = ADRESS;
    }

  
    

   
 
 
 
 
 
 
 
}
