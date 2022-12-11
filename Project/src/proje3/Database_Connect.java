
package proje3;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_Connect {
    
private Connection con=null;

private Statement st=null;
private PreparedStatement pS=null;

public   ArrayList<Musteri> Musteri_Veri_Getir(String ad){
    
    ArrayList<Musteri> sonuc=new  ArrayList<Musteri>();
    
  
    
    try {
        st=con.createStatement(); 
    ResultSet rs=st.executeQuery("Select * From customers where CID="+(ad));
        
   while(rs.next()){
       
   sonuc.add(new Musteri(
   
   rs.getInt("CID"),
   rs.getString("PASSWORD"),
   rs.getString("NAMESURNAME"),
   rs.getString("TCNO"),
   rs.getString("EMAIL"),
   rs.getString("CREATEDDATE"),
   rs.getString("TELNR"),
   rs.getInt("USERID"),
   rs.getString("ADRESS")
           
           
           
   
  
   
   ));    
    }
        return sonuc; // sorgudan gelen verileri arrayliste döndürür
    
    
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        return null; // eğer hata olursa arraylist boş döndürür
    }
    
    
    
}
public   ArrayList<Musteri> Musteri_Temsilci_Musteri_Veri_Getir(String ad){
    
    ArrayList<Musteri> sonuc=new  ArrayList<Musteri>();
    
  
    
    try {
        st=con.createStatement(); 
    ResultSet rs=st.executeQuery("Select * From customers where USERID="+(ad));
        
   while(rs.next()){
       
   sonuc.add(new Musteri(
   
   rs.getInt("CID"),
   rs.getString("PASSWORD"),
   rs.getString("NAMESURNAME"),
   rs.getString("TCNO"),
   rs.getString("EMAIL"),
   rs.getString("CREATEDDATE"),
   rs.getString("TELNR"),
   rs.getInt("USERID"),
   rs.getString("ADRESS")
           
           
           
   
  
   
   ));    
    }
        return sonuc; // sorgudan gelen verileri arrayliste döndürür
    
    
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        return null; // eğer hata olursa arraylist boş döndürür
    }
    
    
    
}
public ArrayList<Faiz> faiziGetir() {
       
         ArrayList<Faiz> cikti=new ArrayList<Faiz>();
    try {
        st=con.createStatement();
        String sorgu="Select INTEREST,OVERDUE_INTEREST from interest";
        ResultSet rs=st.executeQuery(sorgu);
        while(rs.next()){
            String ınterest=rs.getString("INTEREST");
            String overdue_ınterest=rs.getString("OVERDUE_INTEREST");
            cikti.add(new Faiz(ınterest,overdue_ınterest));
             
        }
        return cikti;
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
        
                 
        
        
    }
  void faizguncelle(String ınterest, String overdue_ınterest) {
  String sorgu =  "Update interest set INTEREST=?,OVERDUE_INTEREST=?";
      try {
        
        pS=con.prepareStatement(sorgu);
        pS.setString(1,ınterest);
        pS.setString(2,overdue_ınterest);
        pS.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
public  ArrayList<Personel>Personel_Veri_Getir(String ad){
    
    ArrayList<Personel> sonuc=new  ArrayList<Personel>();  
    try {
        st=con.createStatement(); 
    ResultSet rs=st.executeQuery("Select * From employee where EID="+(ad));
        
   while(rs.next()){
       
   sonuc.add(new Personel(
   
   rs.getInt("EID"),
   rs.getString("PASSWORD"),
   rs.getString("NAMESURNAME"),
   rs.getString("TCNO"),
   rs.getString("EMAIL"),
   rs.getString("TELNR"),
   rs.getString("ADRESS")
           
           
           
   
  
   
   ));    
    }
        System.out.println("sonuç");
        return sonuc; // sorgudan gelen verileri arrayliste döndürür
       
    
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        return null; // eğer hata olursa arraylist boş döndürür
    }
    
    
    
}
public   ArrayList<Hesap> Musteri_Hesap_Getir(String ad){
    
    ArrayList<Hesap> sonuc=new  ArrayList<Hesap>();
    
  
    
    try {
        st=con.createStatement(); 
    ResultSet rs=st.executeQuery("Select * From account where CID="+(ad));
        
   while(rs.next()){
       
   sonuc.add(new Hesap(
           
   rs.getInt("AID"),
   rs.getFloat("BALANCE"),
   rs.getInt("CID")
    
   ));    
    }
        return sonuc; // sorgudan gelen verileri arrayliste döndürür
    
    
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
        return null; // eğer hata olursa arraylist boş döndürür
    }
    
    
    
}

public void Musteri_Veri_Guncelle(int yedekcid,String yedeksifre,String yedekadsoyad,String yedekemail,String yedektel,String yedekadres){
    
    String query="Update customers set PASSWORD=?,NAMESURNAME=?,EMAIL=?,TELNR=?,ADRESS=? where CID=?"; 
    
    try {
        pS=con.prepareStatement(query);
        
        pS.setString(1,yedeksifre);
        pS.setString(2,yedekadsoyad);
        pS.setString(3,yedekemail);
        pS.setString(4,yedektel);
        pS.setString(5,yedekadres);
        pS.setInt(6,yedekcid);
        
        pS.executeUpdate();
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}

public void Personel_Veri_Guncelle(int yedekeid,String yedeksifre,String yedekadsoyad,String yedekemail,String yedektel,String yedekadres){
    
    String query="Update employee set PASSWORD=?,NAMESURNAME=?,EMAIL=?,TELNR=?,ADRESS=? where EID=?"; 
    
    try {
        pS=con.prepareStatement(query);
        
        pS.setString(1,yedeksifre);
        pS.setString(2,yedekadsoyad);
        pS.setString(3,yedekemail);
        pS.setString(4,yedektel);
        pS.setString(5,yedekadres);
        pS.setInt(6,yedekeid);
        
        pS.executeUpdate();
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}

public void Musteri_Sil(int yedekcid){
    
    try {
        pS=con.prepareStatement("Delete From customers where CID=?");
        pS.setInt(1,yedekcid);
        
        pS.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}
public void Temsilci_Musteri_Ekle(String musterisifre,String musteriadsoyad,String musteritcno,String musteriemail,String musteritarih,String musteritelno,String musteriuserid,String musteriadres){
    

    try {
        pS=con.prepareStatement("Insert Into customers(PASSWORD,NAMESURNAME,TCNO,EMAIL,CREATEDDATE,TELNR,USERID,ADRESS)VALUES(?,?,?,?,?,?,?,?)");
        
        pS.setString(1, musterisifre);
        pS.setString(2, musteriadsoyad);
        pS.setString(3, musteritcno);
        pS.setString(4, musteriemail);
        pS.setString(5, musteritarih);
        pS.setString(6, musteritelno);
        pS.setString(7, musteriuserid);      
        pS.setString(8, musteriadres);
        
        pS.executeUpdate();
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
}
public void Temsilci_Hesap_Ekle(String hesapbakiye,String hesapcid){
    
    try {
        pS=con.prepareStatement("Insert Into account(BALANCE,CID)VALUES(?,?)");
        
        pS.setString(1, hesapbakiye);
        pS.setString(2, hesapcid);
        
        pS.executeUpdate();
        
    } catch (SQLException ex) {
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}
public boolean Musteri_Login(String ad,String parola){
    
    try{
        
       pS=con.prepareStatement("Select * From customers where CID =? and PASSWORD =?");
       pS.setString(1,ad);
       pS.setString(2,parola);
       
       ResultSet rs=pS.executeQuery();
       if(rs.next()==false){
        return false;
    }
       else{
           return true;
       }     
    }catch(SQLException ex){
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null,ex);
        return false;
    }
       
}
public boolean Personel_Login(String ad,String parola){
    try{
        
       pS=con.prepareStatement("Select * From employee where EID =? and PASSWORD =?");
       pS.setString(1,ad);
       pS.setString(2,parola);
       
       ResultSet rs=pS.executeQuery();
       if(rs.next()==false){
        return false;
    }
       else{
           return true;
       }     
    }
    catch(SQLException ex){
        Logger.getLogger(Database_Connect.class.getName()).log(Level.SEVERE, null,ex);
        return false;
    }
    
}

public Database_Connect(){
    
String url="jdbc:mysql://"+Database.host + ":" +Database.port + "/" +Database.database_name;
    
   try{
      
      Class.forName("com.mysql.jdbc.Driver");
  }catch(ClassNotFoundException ex){
      
      System.out.println("Driver bulunamadi");
  }
  try{
      
      con=DriverManager.getConnection(url,Database.user_n,Database.sifre);
      System.out.println("Bağlantı basarılı");
      
  }catch(SQLException ex){
      
      System.out.println("Bağlantı basarısız");
      ex.printStackTrace();
  }     
    
}
    public static void main(String[] args) {
        Database_Connect goster=new Database_Connect();
        
    }
 
    
    
    
}
